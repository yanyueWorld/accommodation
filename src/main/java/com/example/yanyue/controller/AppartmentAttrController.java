package com.example.yanyue.controller;

import com.example.yanyue.pojo.ApartmentAttr;
import com.example.yanyue.service.AppartmentAttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/appartmentAttr")
public class AppartmentAttrController {
    @Autowired
    private AppartmentAttrService appartmentAttrService;

    /**
     * @Author yanyue
     * @Description 获取房间属性
     * @Url /appartmentAttr/getAll
     * @Param [apartmentAttr] 房间属性参数 前端可以不用参数传递
     * @return java.util.List<com.example.yanyue.pojo.ApartmentAttr> 房间属性 json数组
     **/
    @RequestMapping("/getAll")
    @ResponseBody
    @CrossOrigin
    public List<ApartmentAttr> getAll(ApartmentAttr apartmentAttr){
        return appartmentAttrService.getAll(apartmentAttr);
    }

}
