package com.lzc.video.util;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class UploadedVideoFile {

    public static String upload(HttpSession session,
                                MultipartFile video) throws IOException {
        String vidname = UUID.randomUUID().toString().replaceAll("-", "");
        // 获取文件的扩展名
        String ext = FilenameUtils.getExtension(video.getOriginalFilename());
        File vidFolder= new File(session.getServletContext().getRealPath("videopath"));
        if(!vidFolder.exists())
            vidFolder.mkdirs();
        video.transferTo(new File(vidFolder+"/"+vidname+"."+ext));
        String vidUrl =vidname+"."+ext;
        return vidUrl;
    }



}