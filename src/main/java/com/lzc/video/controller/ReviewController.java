package com.lzc.video.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzc.video.pojo.Category;
import com.lzc.video.pojo.Review;
import com.lzc.video.pojo.Video;
import com.lzc.video.service.CategoryService;
import com.lzc.video.service.ReviewService;
import com.lzc.video.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping("")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @RequestMapping("admin_review_list")
    public String list(Model model,Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Review> rs= reviewService.list();
        int total = (int) new PageInfo<>(rs).getTotal();
        page.setTotal(total);
        model.addAttribute("rs", rs);
        model.addAttribute("page", page);
        return "admin/listreview";   //jump jsp
    }


    @RequestMapping("admin_review_delete")
    public String delete(int rev_id) {
        Review r = reviewService.get(rev_id);
        reviewService.delete(r.getRev_id());
        return "redirect:admin_review_list";//jump controller
    }

}