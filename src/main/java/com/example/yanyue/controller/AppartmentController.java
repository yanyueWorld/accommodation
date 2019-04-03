package com.example.yanyue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.yanyue.pojo.common.Result;
import com.example.yanyue.pojo.vo.AppartmentVO;
import com.example.yanyue.service.AppartmentService;
import com.github.pagehelper.PageInfo;

/**
 * @ClassName AppartmentController
 * @Description 公寓信息视图控制类
 * @Author yanyue
 * @Date 2019/3/27 13:20
 * @Version 1.0
 **/

@Controller
public class AppartmentController {

    @Autowired
    private AppartmentService appartmentService;

    @RequestMapping("/getAppartmentByExample")
    @ResponseBody
    public Result<List<AppartmentVO>> getAppartmentByExample(@RequestParam(value = "page", defaultValue = "1", required = false) Integer currentPage,
                                                             @RequestParam(value = "limit", defaultValue = "10", required = false) Integer pageSize,AppartmentVO appartmentVO) {
        List<AppartmentVO> appartmentVOS = appartmentService.getAppartmentByExample(currentPage,
                pageSize,appartmentVO);
        System.out.println(appartmentVO);
        Result<List<AppartmentVO>> result = Result.success(appartmentVOS);
        PageInfo<AppartmentVO> pageInfo = new PageInfo<>(appartmentVOS);
        result.setCount(pageInfo.getTotal());
        return result;
    }
}
