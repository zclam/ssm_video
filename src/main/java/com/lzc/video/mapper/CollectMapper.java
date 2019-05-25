package com.lzc.video.mapper;

import com.lzc.video.pojo.CollectExample;
import com.lzc.video.pojo.CollectKey;

import java.util.List;

public interface CollectMapper {
    int deleteByPrimaryKey(CollectKey key);

    int insert(CollectKey record);

    int insertSelective(CollectKey record);

    List<CollectKey> selectByExample(CollectExample example);

    //problem:没有 Collectkey selectByPrimaryKey(Integer user_id);differing from CategoryMapper and VideoMapper with this PrimaryKey 组成 from others' son table 's foreignKey.
    //slution:1.create      ？？？2.find one from otherwhere,relate with
}