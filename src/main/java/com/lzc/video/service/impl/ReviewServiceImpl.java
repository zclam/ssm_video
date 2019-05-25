package com.lzc.video.service.impl;

import com.lzc.video.mapper.ReviewMapper;
import com.lzc.video.pojo.Review;
import com.lzc.video.pojo.ReviewExample;
import com.lzc.video.pojo.User;
import com.lzc.video.pojo.Video;
import com.lzc.video.service.ReviewService;
import com.lzc.video.service.UserService;
import com.lzc.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    ReviewMapper reviewMapper;
    @Autowired
    UserService userService;
    @Autowired
    VideoService videoService;

    @Override
    public void add(Review review) {
        reviewMapper.insert(review);
    }

    @Override
    public void delete(int rev_id) {
        reviewMapper.deleteByPrimaryKey(rev_id);
    }

    @Override
    public Review get(int rev_id) {
        return reviewMapper.selectByPrimaryKey(rev_id);
    }

    @Override
    public List<Review> list(int vid_id) {
        ReviewExample example = new ReviewExample();
        example.createCriteria().andVid_idEqualTo(vid_id);
        example.setOrderByClause("rev_id desc");
        List<Review> result = reviewMapper.selectByExample(example);
        setUser(result);
        return result;
    }

    @Override
    public List<Review> list() {
        ReviewExample example = new ReviewExample();
        example.setOrderByClause("rev_id desc");
        List<Review> result = reviewMapper.selectByExample(example);
        setUser(result);
        setVideo(result);
        return result;
    }

    private void setUser(List<Review> reviews) {
        for (Review review:reviews) {
            setUser(review);

        }

    }

    private void setUser(Review review) {
        int uid = review.getUser_id();
        User user =userService.get(uid);
        System.out.print("setUsertest:"+user);
        review.setUser(user);
    }

    private void setVideo(List<Review> reviews) {
        for (Review review:reviews) {
            setVideo(review);
        }

    }

    private void setVideo(Review review) {
        int vid_id = review.getVid_id();
        Video video =videoService.get(vid_id);
        review.setVideo(video);

    }

}
