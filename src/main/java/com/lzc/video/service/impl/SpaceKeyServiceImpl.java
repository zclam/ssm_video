package com.lzc.video.service.impl;

import com.lzc.video.mapper.SpaceMapper;
import com.lzc.video.pojo.SpaceExample;
import com.lzc.video.pojo.SpaceKey;
import com.lzc.video.service.SpaceKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SpaceKeyServiceImpl implements SpaceKeyService {
    @Autowired
    SpaceMapper SpaceMapper;

    @Override
    public void add(SpaceKey spaceMapper) {
        SpaceMapper.insert(spaceMapper);

    }

    @Override
    public List<SpaceKey> listByUser(Integer user_id) {
        SpaceExample example = new SpaceExample();
        example.createCriteria().andUser_idEqualTo(user_id);
        example.setOrderByClause("vid_id desc");
        List<SpaceKey> result =SpaceMapper.selectByExample(example); //use_id
        return result;
    }

    @Override
    public boolean isExist(int user_id,int vid_id) {
        SpaceExample example =new SpaceExample();
        example.createCriteria().andVid_idEqualTo(vid_id).andUser_idEqualTo(user_id);
        List<SpaceKey> result= SpaceMapper.selectByExample(example);
        if(!result.isEmpty())
            return true;
        return false;
    }

    @Override
    public void delete(SpaceKey c) {
        SpaceMapper.deleteByPrimaryKey(c);
    }
}
