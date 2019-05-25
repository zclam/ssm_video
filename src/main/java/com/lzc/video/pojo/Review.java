package com.lzc.video.pojo;

public class Review {
    private Integer rev_id;

    private String rev_con;

    private Integer user_id;

    private Integer vid_id;

    //add
    User user;//reviewSevice 装入数据
    //add
    Video video;

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getRev_id() {
        return rev_id;
    }


    public String getRev_con() {
        return rev_con;
    }

    public void setRev_con(String rev_con) {
        this.rev_con = rev_con == null ? null : rev_con.trim();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getVid_id() {
        return vid_id;
    }

    public void setVid_id(Integer vid_id) {
        this.vid_id = vid_id;
    }
}