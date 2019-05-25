package com.lzc.video.pojo;

import java.util.Date;

public class Video {
    private Integer vid_id;

    private String vid_name;

    private Date vid_time;

    private Integer vid_cli=0;

    private Integer cat_id;

    private String video_url;

    private String pic_url;

    //add
    Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getVid_id() {
        return vid_id;
    }

    public void setVid_id(Integer vid_id) {
        this.vid_id = vid_id;
    }

    public String getVid_name() {
        return vid_name;
    }

    public void setVid_name(String vid_name) {
        this.vid_name = vid_name == null ? null : vid_name.trim();
    }

    public Date getVid_time() {
        return vid_time;
    }

    public void setVid_time(Date vid_time) {
        this.vid_time = vid_time;
    }

    public Integer getVid_cli() {
        return vid_cli;
    }

    public void setVid_cli(Integer vid_cli) {
        this.vid_cli = vid_cli;
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url == null ? null : video_url.trim();
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url == null ? null : pic_url.trim();
    }
}