package com.example.yanyue.controller;

import com.example.yanyue.pojo.ApartmentClass;
import com.example.yanyue.service.AppartmentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/appartmentClass")
public class AppartmentClassController {

    @Autowired
    private AppartmentClassService appartmentClassService;
    /**
     * @Author yanyue
     * 查询房间类型
     * 路径： /appartment/Class
     * @Param apartmentClass 房间属性,前端可以不用参数传递
     * @return java.util.List<com.example.yanyue.pojo.ApartmentClass> 房间属性json数组
     **/
    @RequestMapping("/getAll")
    @ResponseBody
    @CrossOrigin
    public List<ApartmentClass> getAll(ApartmentClass apartmentClass){
        return appartmentClassService.getAll(apartmentClass);
    }
}
