package com.example.yanyue.controller;

import com.example.yanyue.pojo.Picture;
import com.example.yanyue.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/picture")
public class PictureController {
    private String staticAccessPath = "/picture";
    @Autowired
    private PictureService pictureService;

    /**
     * @Author yanyue
     * 上传图片
     * 路径: /picture/upload
     * @Param file 上传的文件
     * @Param appartmentId 公寓id
     * @Param type 上传图片的类型
     * @return int 上传返回结果,<=0 失败
     **/
    @RequestMapping("/upload")
    @ResponseBody
    @CrossOrigin
    public int upload(MultipartFile file, Integer appartmentId, String type) {
        System.out.println(file);
        System.out.println(appartmentId);
        System.out.println(type);
        if (file.isEmpty()) {
            System.out.println("文件获取失败");
        }
        if (appartmentId == null || appartmentId == 0) {
            return -1;
        }
        String originalFileName = file.getOriginalFilename();
        System.out.println(originalFileName);
        String saveFileName = appartmentId + type + originalFileName;
        String path = staticAccessPath + "/" + saveFileName;
        File dest = new File(staticAccessPath + saveFileName);
        System.out.println(saveFileName);
        System.out.println(path);
        try {
            file.transferTo(dest);
            System.out.println("上传成功");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        Picture picture = new Picture();
        picture.setPicName(saveFileName);
        picture.setPicAddr(path);
        return pictureService.insert(picture, appartmentId);
    }
}
