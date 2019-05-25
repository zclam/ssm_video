package com.lzc.video.pojo;

public class Admin {
    private Integer adm_id;

    private String adm_name;

    private String adm_pwd;

    public Integer getAdm_id() {
        return adm_id;
    }

    public void setAdm_id(Integer adm_id) {
        this.adm_id = adm_id;
    }

    public String getAdm_name() {
        return adm_name;
    }

    public void setAdm_name(String adm_name) {
        this.adm_name = adm_name == null ? null : adm_name.trim();
    }

    public String getAdm_pwd() {
        return adm_pwd;
    }

    public void setAdm_pwd(String adm_pwd) {
        this.adm_pwd = adm_pwd == null ? null : adm_pwd.trim();
    }
}