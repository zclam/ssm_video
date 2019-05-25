package com.lzc.video.service;

import com.lzc.video.pojo.Review;

import java.util.List;

public interface ReviewService {

    void add(Review review);

    void delete(int rev_id);

    Review get(int rev_id);

    List<Review> list(int vid_id);

    List<Review> list();
}