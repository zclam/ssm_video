package com.lzc.video.service.impl;

import com.lzc.video.mapper.VideoMapper;
import com.lzc.video.pojo.Category;
import com.lzc.video.pojo.Video;
import com.lzc.video.pojo.VideoExample;
import com.lzc.video.service.CategoryService;
import com.lzc.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    VideoMapper videoMapper;
    @Autowired
    CategoryService categoryService;

    @Override
    public void delete(int vid_id) {
        videoMapper.deleteByPrimaryKey(vid_id);
    }

    @Override
    public List list(int cat_id) {
        VideoExample example = new VideoExample();
        example.createCriteria().andCat_idEqualTo(cat_id);
        example.setOrderByClause("vid_id desc");
        List result = videoMapper.selectByExample(example);
        setCategory(result);
        return result;
    }

    public void setCategory(List<Video> vs) {
        for (Video v : vs)
            setCategory(v);
    }

    private void setCategory(Video v) {
        int cat_id = v.getCat_id();
        System.out.println("test100:"+cat_id);
        Category c = categoryService.get(cat_id);
        v.setCategory(c);
    }

    @Override
    public Video get(int vid_id) {
        Video v = videoMapper.selectByPrimaryKey(vid_id);
        setCategory(v);
        return v;
    }

    @Override
    public void fill(List<Category> cs) {
        for (Category c : cs) {
            fill(c);
        }
    }

    @Override
    public void fill(Category c) {
        List<Video> vs = list(c.getCat_id()); //list video
        c.setVideos(vs);                     //
    }

    @Override
    public int insertSelective(Video record) {
        videoMapper.insertSelective(record);
        return 0;
    }

    @Override
    public List<Video> search(String keyword) {
        VideoExample example = new VideoExample();
        example.createCriteria().andVid_nameLike("%" + keyword + "%");
        example.setOrderByClause("vid_id desc");
        List result = videoMapper.selectByExample(example);
        setCategory(result);
        return result;
    }

    @Override
    public void update(Video v) {
        videoMapper.updateByPrimaryKeySelective(v);
    }


}
