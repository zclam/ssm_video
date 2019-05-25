package com.lzc.video.service;

import com.lzc.video.pojo.CollectKey;


import java.util.List;

public interface CollectKeyService {

    void addCollect(CollectKey collectkey);

    List<CollectKey> listByUser(Integer user_id);

    boolean isExist(int user_id,int vid_id);

    void  delete(CollectKey c);
}