package com.lzc.video.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzc.video.pojo.Category;
import com.lzc.video.pojo.Video;
import com.lzc.video.service.CategoryService;
import com.lzc.video.service.VideoService;
/*import com.lzc.video.util.ImageUtil;*/
import com.lzc.video.util.Page;
import com.lzc.video.util.UploadedImageFile;
import com.lzc.video.util.UploadedVideoFile;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("")
public class VideoController {
    @Autowired
    VideoService videoService;
    @Autowired
    CategoryService categoryService;

    @RequestMapping("admin_category_list")
    public String list(Model model,Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Category> cs= categoryService.list();
        int total = (int) new PageInfo<>(cs).getTotal();
        page.setTotal(total);
        model.addAttribute("cs", cs);
        model.addAttribute("page", page);
        return "admin/listCategory";
    }


    @RequestMapping("admin_video_delete")
    public String delete(int vid_id,HttpSession session) {
        Video v = videoService.get(vid_id);
        int cat_id = v.getCat_id();
        //delete img
        File imgFolder= new File(session.getServletContext().getRealPath("img/video"));
        String imgUrl = v.getPic_url();
        new File(imgFolder+"/"+imgUrl).delete();
        //delete video
        File vidFolder= new File(session.getServletContext().getRealPath("/videopath"));
        String vidUrl = v.getVideo_url();
        new File(imgFolder+"/"+vidUrl).delete();

        videoService.delete(vid_id);
        return "redirect:admin_video_list?cat_id="+cat_id;
    }

    @RequestMapping("admin_video_list")
    public String list(int cat_id, Model model, Page page) {
        Category c = categoryService.get(cat_id);
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Video> vs = videoService.list(cat_id);

        int total = (int) new PageInfo<>(vs).getTotal();
        page.setTotal(total);
        page.setParam("&cat_id="+c.getCat_id());

        model.addAttribute("vs", vs);
        model.addAttribute("c", c);
        model.addAttribute("page", page);
        return "admin/listVideo";
    }



    @RequestMapping(value = "admin_uploader_add"/*, method = RequestMethod.POST*/)
    public void upload(HttpServletRequest request, HttpServletResponse response) {
        Video v = new Video();
        int counter = 0;
        String videoName;

        MultipartHttpServletRequest videos = (MultipartHttpServletRequest) request;
        Map<String, MultipartFile> vs = videos.getFileMap();//得到文件map对象
        String videoUrl = request.getSession().getServletContext().getRealPath("videopath");//得到当前工程路径拼接上文件名
        File imgFolder = new File(videoUrl);

        if (!imgFolder.exists())
            imgFolder.mkdirs();
        for (MultipartFile file : vs.values()) {
            counter++;
            videoName = file.getOriginalFilename();

            try {
                file.transferTo(new File(videoUrl+"/" + videoName));//创建文件对象
            } catch (IOException e) {
                e.printStackTrace();
            }
            v.setCat_id(Integer.parseInt(request.getParameter("cat_id")));
            v.setVid_name(videoName.substring(0, videoName.lastIndexOf(".")));
            v.setVid_time(new Date());
            v.setVideo_url(videoName);
            videoService.insertSelective(v);
        }

    }

}