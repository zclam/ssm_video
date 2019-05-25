package com.lzc.video.service.impl;

import com.lzc.video.mapper.UserMapper;
import com.lzc.video.pojo.User;
import com.lzc.video.pojo.UserExample;
import com.lzc.video.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> list() {
        UserExample example =new UserExample();
        example.setOrderByClause("user_id desc");
        return userMapper.selectByExample(example);
    }

    @Override
    public void delete(int user_id) {
        userMapper.deleteByPrimaryKey(user_id);
    }

    @Override
    public User get(int user_id) {
        return userMapper.selectByPrimaryKey(user_id);
    }

    @Override
    public boolean isExist(String user_name) {
        UserExample example =new UserExample();
        example.createCriteria().andUser_nameEqualTo(user_name);
        List<User> result= userMapper.selectByExample(example);
        if(!result.isEmpty())
            return true;
        return false;
    }

    @Override
    public void add(User u) {
        userMapper.insert(u);
    }

    @Override
    public User get(String user_name, String user_pwd) {
        UserExample example =new UserExample();
        example.createCriteria().andUser_nameEqualTo(user_name).andUser_pwdEqualTo(user_pwd);
        List<User> result= userMapper.selectByExample(example);
        if(result.isEmpty())
            return null;
        return result.get(0);
    }
}