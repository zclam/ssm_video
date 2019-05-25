package com.lzc.video.mapper;

import com.lzc.video.pojo.SpaceExample;
import com.lzc.video.pojo.SpaceKey;

import java.util.List;

public interface SpaceMapper {
    int deleteByPrimaryKey(SpaceKey key);

    int insert(SpaceKey record);

    int insertSelective(SpaceKey record);

    List<SpaceKey> selectByExample(SpaceExample example);
}