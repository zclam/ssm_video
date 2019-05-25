package com.lzc.video.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzc.video.pojo.*;
import com.lzc.video.service.*;
import com.lzc.video.util.Page;
import com.lzc.video.util.UploadedImageFile;
import com.lzc.video.util.UploadedVideoFile;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.HtmlUtils;
import video.comparator.VideoClickComparator;
import video.comparator.VideoDateComparator;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("")
public class ForeController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    VideoService videoService;
    @Autowired
    UserService userService;
    @Autowired
    AdminService AdminService;
    @Autowired
    ReviewService reviewService;
    @Autowired
    CollectKeyService collectkeyService;
    @Autowired
    SpaceKeyService spacekeyService;



    @RequestMapping("forehome")
    public String home(Model model) {
        List<Category> cs = categoryService.list();
        videoService.fill(cs);
        model.addAttribute("cs", cs);
        return "fore/home";
    }

    @RequestMapping("foreregister")
    public String register(Model model, User user) {
        String name = user.getUser_name();
        name = HtmlUtils.htmlEscape(name);
        user.setUser_name(name);
        boolean exist = userService.isExist(name);

        if (exist) {
            String m = "用户名已经被使用,不能使用";
            model.addAttribute("msg", m);
            model.addAttribute("user", null);
            return "fore/register";
        }
        userService.add(user);
        return "redirect:registerSuccessPage";
    }

    @RequestMapping("forelogin")
    public String login(@RequestParam("name") String name, @RequestParam("password") String password, Model model, HttpSession session) {
        name = HtmlUtils.htmlEscape(name);
        User user = userService.get(name, password);

        if (null == user) {
            model.addAttribute("msg", "账号密码错误");
            return "fore/login";
        }
        session.setAttribute("user", user);
        session.setAttribute("user_id", user.getUser_id());
        System.out.println("userid:"+ user.getUser_id());
        System.out.println("user:"+ user);
        return "redirect:forehome";
    }

    @RequestMapping("admlogin")
    public String adminlogin(@RequestParam("name") String name, @RequestParam("password") String password, Model model, HttpSession session) {
        name = HtmlUtils.htmlEscape(name);
        Admin admin = AdminService.get(name, password);
        if (null == admin) {
            model.addAttribute("msg", "账号密码错误");
            return "fore/adminLogin";
        }
        session.setAttribute("admin", admin);
        return "redirect:admin_category_list";
    }

    @RequestMapping("foreloginAjax")
    @ResponseBody
    public String loginAjax(@RequestParam("name") String user_name, @RequestParam("password") String user_pwd, HttpSession session) {
        user_name = HtmlUtils.htmlEscape(user_name);
        User user = userService.get(user_name, user_pwd);

        if (null == user) {
            return "fail";
        }
        session.setAttribute("user", user);
        return "success";
    }

    @RequestMapping("forecheckLogin")
    @ResponseBody
    public String checkLogin(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (null != user)
            return "success";
        return "fail";
    }

    @RequestMapping("forelogout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:forehome";
    }

    @RequestMapping("forevideo")
    public String forevideo(int vid_id, Model model,Page page) {
        Video v = videoService.get(vid_id);
        Integer vid_cli = v.getVid_cli();
        if (vid_cli == 0) {
            vid_cli = 1;
        } else {
            vid_cli += 1;
        }
        v.setVid_cli(vid_cli);
        videoService.update(v);
        /*v.getVid_cli() =
                (Integer)application.getAttribute("hitCounter");
        application.setAttribute("hitCounter", hitsCount);*/
        //分页插件设置分页参数后，会存储到local线程,select方法调用后会被拦截器拦截，从本地线程中拿到参数重新组装sql语句，这就是为什么颠倒后不能实现分页了
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Review> reviews = reviewService.list(vid_id);
        int total = (int) new PageInfo<>(reviews).getTotal();
        page.setTotal(total);
        page.setParam("&vid_id="+vid_id);
        model.addAttribute("v", v);
        model.addAttribute("reviews", reviews);
        return "fore/video";
    }

    @RequestMapping("fore_download")
    public ResponseEntity<byte[]> download(HttpServletRequest request, @RequestParam(value = "video_url") String fileName)
            throws Exception {
    /*    String fName = fileName.substring(fileName.lastIndexOf("_") + 1); // 从uuid_name.jpg中截取文件名*/
        //根据文件的绝对路径，获取文件
        File file = new File(request.getServletContext().getRealPath("/videopath/" + fileName));
        //设置请求头
        HttpHeaders headers = new HttpHeaders();
        fileName = new String(fileName.getBytes("utf-8"), "iso8859-1");
        headers.add("Content-Disposition", "attachment;filename=" + fileName);
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, statusCode);
        return response;
    }

    @RequestMapping("forecategory")
    public String category(int cat_id, String sort, Model model) {
        Category c = categoryService.get(cat_id);
        videoService.fill(c);
        if (null != sort) {
            switch (sort) {
                case "click":
                    Collections.sort(c.getVideos(), new VideoClickComparator());
                    break;
                case "date":
                    Collections.sort(c.getVideos(), new VideoDateComparator());
                    break;
            }
        }
        model.addAttribute("c", c);
        return "fore/category";
    }

    @RequestMapping("foresearch")
    public String foresearch(String keyword, Model model, String sort) {
        System.out.println("testsearch:" + keyword);
        PageHelper.offsetPage(0, 20);
        List<Video> vs = null;//提交的数据为空的话
        if ("" != keyword) {
            vs = videoService.search(keyword);
        }
/*        if (null != sort) {
            switch (sort) {
                case "click":
                    Collections.sort(vs, new VideoClickComparator());
                    break;
                case "date":
                    Collections.sort(vs, new VideoDateComparator());
                    break;
            }
        }*/
        model.addAttribute("vs", vs);
/*        model.addAttribute("keyword", keyword);*/
        return "fore/searchResult";
    }

    @RequestMapping("fore_collect_add")
    @ResponseBody
    public String collect_add(int vid_id, HttpSession session) {
        User u = (User) session.getAttribute("user");
        List<CollectKey> collects = collectkeyService.listByUser(u.getUser_id());
        boolean exist = collectkeyService.isExist(u.getUser_id(), vid_id);
        if (exist) {
            return "fail";
        } else {
            CollectKey collect = new CollectKey();//!P
            collect.setVid_id(vid_id);
            collect.setUser_id(u.getUser_id());
            collectkeyService.addCollect(collect);
            return "success";
        }

    }
    /*    for (CollectKey collect : collects) {
            collect.setVid_id(vid_id);
            collect.setUser_id(u.getUser_id());
            collectkeyService.addCollect(collect);
            System.out.println("addtest" + collect.getVid_id());*/
     /*  CollectKey collect = new CollectKey();//!P
        collect.setVid_id(vid_id);
        collect.setUser_id(u.getUser_id());
        collectkeyService.addCollect(collect);
        return "suc";*/
    //    collect.setVideo(v);//装进对象里但是无法装进数据表里!!!!!


    @RequestMapping("fore_collect_list")
//！P:mapper's way is 'List<CollectKey> selectByExample(CollectExample example);'(即得到收藏表集合对象)。 ！S:在controller解决目标需求
    public String collect_list(Model model, HttpSession session, Page page) {
        PageHelper.offsetPage(page.getStart(), page.getCount());
        User u = (User) session.getAttribute("user");
        List<CollectKey> collects = collectkeyService.listByUser(u.getUser_id());//通过user_id获得收藏表集合对象
        int total = (int) new PageInfo<>(collects).getTotal();
        page.setTotal(total);
        List<Video> vs = new ArrayList<>();
        for (CollectKey collect : collects) {
            Video v = videoService.get(collect.getVid_id());
            vs.add(v);
        }
        model.addAttribute("page", page);
        model.addAttribute("vs", vs);
        return "fore/collect";
    }

    @RequestMapping("fore_collect_delete")
    public String collect_delete(int vid_id, HttpSession session) {
        User u = (User) session.getAttribute("user");
        List<CollectKey> collects = collectkeyService.listByUser(u.getUser_id());
        for (CollectKey collect : collects) {
            if (collect.getVid_id() == vid_id) { //如果收藏表对象的vid_id和传过来要删除的视频vid_id相同的话
                collectkeyService.delete(collect);
            }
        }
        System.out.println("delete1:" + u.getUser_id());
        return "redirect:fore_collect_list?user_id=" + u.getUser_id(); //????不能转发，*/
    }

    @RequestMapping("fore_video_add")
    public String addvideo(String cat_name,Video v, HttpSession session, MultipartFile video, MultipartFile image) throws IOException {
        /*SimpleDateFormat vt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式*/
        //插入视频
        v.setVid_time(new Date());
        v.setPic_url(UploadedImageFile.upload(session, image));
        v.setVideo_url(UploadedVideoFile.upload(session, video));
        List<Category> cs = categoryService.get2(cat_name);
        for (Category c : cs) {
            v.setCat_id(c.getCat_id());
        }
        videoService.insertSelective(v);
        //插入空间表
        User u = (User) session.getAttribute("user");
    /*  List<SpaceKey> spaces = spacekeyService.listByUser(u.getUser_id());*/
        SpaceKey space = new SpaceKey();//!P
        space.setVid_id(v.getVid_id());
        space.setUser_id(u.getUser_id());
        spacekeyService.add(space);
        return "redirect:/fore_space_list?user_id=" + u.getUser_id();
    }

    @RequestMapping("fore_space_list")
    public String list(Model model, Page page, HttpSession session) {
        PageHelper.offsetPage(page.getStart(), page.getCount());
        User u = (User) session.getAttribute("user");
        List<SpaceKey> spaces = spacekeyService.listByUser(u.getUser_id());//通过user_id获得收藏表集合对象
        int total = (int) new PageInfo<>(spaces).getTotal();
        page.setTotal(total);
        List<Video> vs = new ArrayList<>();
        for (SpaceKey space : spaces) {
            Video v = videoService.get(space.getVid_id());
            vs.add(v);
        }
        List<Category>  cs = categoryService.list();
        model.addAttribute("vs", vs);
        model.addAttribute("cs", cs);
        model.addAttribute("page", page);
        model.addAttribute("spaces", spaces);
        return "fore/space";
    }

    @RequestMapping("fore_space_delete")
    public String spacedelete(int vid_id, HttpSession session) {
        User u = (User) session.getAttribute("user");
        Video v = videoService.get(vid_id);
        List<SpaceKey> spaces = spacekeyService.listByUser(u.getUser_id());
        //delete img
        File imgFolder = new File(session.getServletContext().getRealPath("img/video"));
        String imgUrl = v.getPic_url();
        new File(imgFolder + "/" + imgUrl).delete();
        //delete video
        File vidFolder = new File(session.getServletContext().getRealPath("/videopath"));
        String vidUrl = v.getVideo_url();
        new File(vidFolder + "/" + vidUrl).delete();
        videoService.delete(vid_id);
        //delete space
        for (SpaceKey space : spaces) {
            if (space.getVid_id() == vid_id) {
                spacekeyService.delete(space);
            }
        }
        return "redirect:fore_space_list?user_id=" + u.getUser_id(); //????不能转发，*/
    }

    @RequestMapping("fore_review_add")
    public String add_review(int vid_id, HttpSession session, String content) {
        User u = (User) session.getAttribute("user");
  /*      List<CollectKey> collects = collectkeyService.listByUser(u.getUser_id());*/
        Review review = new Review();
        content = HtmlUtils.htmlEscape(content);//特殊字符转义
        review.setVid_id(vid_id);
        review.setUser_id(u.getUser_id());
        review.setRev_con(content);
        reviewService.add(review);

        return "redirect:forevideo?vid_id="+vid_id;
    }

    @RequestMapping("fore_review_delete")
    public String delete_review(int rev_id) {
        Review r=reviewService.get(rev_id);
        reviewService.delete(rev_id);
        return "redirect:forevideo?vid_id="+r.getVid_id();
    }

}