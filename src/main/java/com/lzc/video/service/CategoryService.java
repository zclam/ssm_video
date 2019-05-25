package com.lzc.video.service;

import com.lzc.video.pojo.Category;

import java.util.List;

public interface CategoryService{

    List<Category> list();

    Category get(int cat_id);


    List<Category> get2(String cat_name);
}