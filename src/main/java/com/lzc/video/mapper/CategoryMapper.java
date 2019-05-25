package com.lzc.video.mapper;

import com.lzc.video.pojo.Category;
import com.lzc.video.pojo.CategoryExample;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer cat_id);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(Integer cat_id);



    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}