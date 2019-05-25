package com.lzc.video.service.impl;

import com.lzc.video.mapper.CategoryMapper;
import com.lzc.video.pojo.Category;
import com.lzc.video.pojo.CategoryExample;
import com.lzc.video.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        CategoryExample example =new CategoryExample();
        example.setOrderByClause("cat_id desc");
        return categoryMapper.selectByExample(example);
    }


    @Override
    public Category get(int cat_id) {
        return categoryMapper.selectByPrimaryKey(cat_id);
    }

    @Override
    public List<Category> get2(String cat_name) {
        CategoryExample example = new CategoryExample();
        example.createCriteria().andCat_nameEqualTo(cat_name);
        return categoryMapper.selectByExample(example);
    }


}