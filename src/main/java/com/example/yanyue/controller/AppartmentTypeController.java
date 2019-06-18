package com.example.yanyue.controller;

import com.example.yanyue.pojo.AppartmentType;
import com.example.yanyue.service.AppartmentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/appartmentType")
public class AppartmentTypeController {

    @Autowired
    AppartmentTypeService appartmentTypeService;

    /**
     * @Author yanyue
     * 获取所有的房间类别
     * 路径： /appartmentType/url
     * @Param appartmentType 公寓类别，查询所有时不用传参
     * @return java.util.List<com.example.yanyue.pojo.AppartmentType> 公寓类别对象json数组
     **/
    @RequestMapping("/getAll")
    @ResponseBody
    @CrossOrigin
    public List<AppartmentType> getAll(AppartmentType appartmentType){
        return appartmentTypeService.getAll(appartmentType);

    }
}
