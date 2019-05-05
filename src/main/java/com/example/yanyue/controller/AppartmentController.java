package com.example.yanyue.controller;

import java.util.List;

import com.example.yanyue.pojo.Appartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/appartment")
public class AppartmentController {

    @Autowired
    private AppartmentService appartmentService;

    @RequestMapping("/getAppartmentByExample")
    @ResponseBody
    @CrossOrigin
    public Result<List<AppartmentVO>> getAppartmentByExample(@RequestParam(value = "page", defaultValue = "1", required = false) Integer currentPage,
                                                             @RequestParam(value = "limit", defaultValue = "5", required = false) Integer pageSize,@RequestBody AppartmentVO appartmentVO) {
        List<AppartmentVO> appartmentVOS = appartmentService.getAppartmentByExample(currentPage,
                pageSize,appartmentVO);
        Result<List<AppartmentVO>> result = Result.success(appartmentVOS);
        PageInfo<AppartmentVO> pageInfo = new PageInfo<>(appartmentVOS);
        result.setCount(pageInfo.getTotal());
        return result;
    }

    @RequestMapping("/deleteByPrimaryKey")
    @ResponseBody
    @CrossOrigin
    public int deleteByPrimaryKey(Integer appartmentId){
        if(appartmentId==null||appartmentId==0){
            return -1;
        }else{
            return appartmentService.deleteByPrimaryKey(appartmentId);
        }
    }

    @RequestMapping("/update")
    @ResponseBody
    @CrossOrigin
    public int updateByPrimaryKeySelective(@RequestBody AppartmentVO appartment){
        System.out.println(appartment);
        if(appartment==null||appartment.getAppartmentId()==null||appartment.getAppartmentId()==0){
            return -1;
        }else{
            return appartmentService.updateByPrimaryKeySelective(appartment);
        }
    }

    @RequestMapping("/insert")
    @ResponseBody
    @CrossOrigin
    public int insert(@RequestBody AppartmentVO appartmentVO){

        return appartmentService.insertSelective(appartmentVO);

    }

    @RequestMapping("/getInfoByAppartmentId")
    @ResponseBody
    @CrossOrigin
    public AppartmentVO getInfoByAppartmentId(Integer appartmentId){
        System.out.println(appartmentId);
        if(appartmentId==null||appartmentId==0){
            return new AppartmentVO();
        }else {
            return appartmentService.getInfoByAppartmentId(appartmentId);
        }
    }


}
