package com.lzc.video.service;



import com.lzc.video.pojo.SpaceKey;

import java.util.List;

public interface SpaceKeyService {
    void add(SpaceKey spaceMapper);

    List<SpaceKey> listByUser(Integer user_id);

    boolean isExist(int user_id,int vid_id);

    void  delete(SpaceKey c);
}
