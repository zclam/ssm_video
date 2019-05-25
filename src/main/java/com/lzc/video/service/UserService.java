package com.lzc.video.service;

import com.lzc.video.pojo.User;

import java.util.List;

public interface UserService {

    List list();

    void delete(int user_id);

    User get(int user_id);

    boolean isExist(String user_name);

    void add(User c);

    User get(String name, String password);
}