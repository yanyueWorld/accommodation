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

@Controller
@RequestMapping("/appartment")
public class AppartmentController {

    @Autowired
    private AppartmentService appartmentService;
    /**
     * @Author yanyue
     * @Description 获取房间
     * @url /appartment/getAppartmentByExample
     * @Param [currentPage, pageSize, appartmentVO] currentPage 当前页，pageSize 每页大小，appartmentVO 公寓视图对象 json数据  前端可以不用参数传递
     * @return com.example.yanyue.pojo.common.Result<java.util.List < com.example.yanyue.pojo.vo.AppartmentVO>> 公寓视图结果封装 json数据
     **/
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

    /**
     * @Author yanyue
     * @Description 根据主键删除公寓信息
     * @url /appartment/deleteByPrimaryKey
     * @Param [appartmentId] int 公寓id
     * @return int
     **/
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

    /**
     * @Author yanyue
     * @Description 更新公寓信息
     * @Url /appartment/update
     * @Param [appartment] 公寓对象 json数据
     * @return int 更新操作结果 <=0为失败
     **/
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

    /**
     * @Author yanyue
     * @Description 新增房间信息
     * @url /appartment/insert
     * @Param [appartmentVO]  json对象
     * @return int 新增数据返回结果 <=0为失败
     **/
    @RequestMapping("/insert")
    @ResponseBody
    @CrossOrigin
    public int insert(@RequestBody AppartmentVO appartmentVO){

        return appartmentService.insertSelective(appartmentVO);

    }

    /**
     * @Author yanyue
     * @Description 获取公寓信息根据公寓id
     * @url /appartment/getInfoByAppartmentId
     * @Param [appartmentId] int公寓id 需要参数传递
     * @return com.example.yanyue.pojo.vo.AppartmentVO 公寓视图对象
     **/
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
