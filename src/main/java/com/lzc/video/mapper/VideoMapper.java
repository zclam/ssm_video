package com.lzc.video.mapper;

import com.lzc.video.pojo.Video;
import com.lzc.video.pojo.VideoExample;

import java.util.List;

public interface VideoMapper {
    int deleteByPrimaryKey(Integer vid_id);

    int insert(Video record);

    int insertSelective(Video record);

    List<Video> selectByExample(VideoExample example);

    Video selectByPrimaryKey(Integer vid_id);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
}