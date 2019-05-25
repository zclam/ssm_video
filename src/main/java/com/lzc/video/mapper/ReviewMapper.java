package com.lzc.video.mapper;

import com.lzc.video.pojo.Review;
import com.lzc.video.pojo.ReviewExample;

import java.util.List;

public interface ReviewMapper {
    int deleteByPrimaryKey(Integer rev_id);

    int insert(Review record);

    int insertSelective(Review record);

    List<Review> selectByExample(ReviewExample example);

    Review selectByPrimaryKey(Integer rev_id);

}