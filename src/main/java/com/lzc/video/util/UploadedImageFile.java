package com.lzc.video.util;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class UploadedImageFile {

    public static String upload(HttpSession session,
                                MultipartFile image) throws IOException {
        String imgname = UUID.randomUUID().toString().replaceAll("-", "");
        // 获取文件的扩展名
        String ext = FilenameUtils.getExtension(image.getOriginalFilename());
        File imgFolder= new File(session.getServletContext().getRealPath("img/video"));
        if(!imgFolder.exists())
            imgFolder.mkdirs();
        image.transferTo(new File(imgFolder+"/"+imgname+"."+ext));
        String imgUrl =imgname+"."+ext;
        return imgUrl;
    }



}