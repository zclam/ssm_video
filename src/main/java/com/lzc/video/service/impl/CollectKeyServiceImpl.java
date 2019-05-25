package com.lzc.video.service.impl;

import com.lzc.video.mapper.CollectMapper;
import com.lzc.video.mapper.ReviewMapper;
import com.lzc.video.pojo.*;
import com.lzc.video.service.CollectKeyService;
import com.lzc.video.service.ReviewService;
import com.lzc.video.service.UserService;
import org.mybatis.generator.codegen.ibatis2.model.ExampleGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectKeyServiceImpl implements CollectKeyService {
    @Autowired
    CollectMapper collectMapper;

    @Override
    public void addCollect(CollectKey collectkey) {
        collectMapper.insert(collectkey);

    }

    @Override
    public List<CollectKey> listByUser(Integer user_id) {
        CollectExample example = new CollectExample();
        example.createCriteria().andUser_idEqualTo(user_id);
        example.setOrderByClause("vid_id desc");
        List<CollectKey> result =collectMapper.selectByExample(example); //use_id
        return result;
    }

    @Override
    public boolean isExist(int user_id,int vid_id) {
        CollectExample example =new CollectExample();
        example.createCriteria().andVid_idEqualTo(vid_id).andUser_idEqualTo(user_id);
        List<CollectKey> result= collectMapper.selectByExample(example);
        if(!result.isEmpty())
            return true;
        return false;
    }

    @Override
    public void delete(CollectKey c) {
        collectMapper.deleteByPrimaryKey(c);
    }


}
