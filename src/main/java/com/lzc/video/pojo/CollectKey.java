package com.lzc.video.pojo;

import java.util.List;

public class CollectKey {
    private Integer vid_id;

    private Integer user_id;

    Video video;

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Integer getVid_id() {
        return vid_id;
    }

    public void setVid_id(Integer vid_id) {
        this.vid_id = vid_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}