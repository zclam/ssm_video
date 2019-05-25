package com.lzc.video.service.impl;

import com.lzc.video.mapper.AdminMapper;
import com.lzc.video.pojo.Admin;
import com.lzc.video.pojo.AdminExample;
import com.lzc.video.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    
    @Override
    public Admin get(int adm_id) {
        return adminMapper.selectByPrimaryKey(adm_id);
    }

    @Override
    public boolean isExist(String adm_name) {
        return false;
    }

    @Override
    public Admin get(String adm_name, String adm_pwd) {//data of insert mapper
        AdminExample example =new AdminExample();
        example.createCriteria().andAdm_nameEqualTo(adm_name).andAdm_pwdEqualTo(adm_pwd);
        List<Admin> result= adminMapper.selectByExample(example);
        if(result.isEmpty())
            return null;
        return result.get(0);
    }
}