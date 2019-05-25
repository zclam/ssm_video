package com.lzc.video.service;

import com.lzc.video.pojo.Admin;
import com.lzc.video.pojo.User;

import java.util.List;

public interface AdminService {


    Admin get(int user_id);

    boolean isExist(String user_name);

    Admin get(String name, String password);
}