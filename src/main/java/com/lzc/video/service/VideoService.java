package com.lzc.video.service;

import com.lzc.video.pojo.Category;
import com.lzc.video.pojo.Video;

import java.util.List;

public interface VideoService {

    List list(int vid_id);

    void delete(int vid_id);

    Video get(int vid_id);

    void fill(List<Category> categorys);

    void fill(Category category);

    int insertSelective(Video record);

    List<Video> search(String keyword);

    void update(Video v);
}