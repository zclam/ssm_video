package com.lzc.video.mapper;

import com.lzc.video.pojo.Admin;
import com.lzc.video.pojo.AdminExample;

import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer adm_id);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer adm_id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}