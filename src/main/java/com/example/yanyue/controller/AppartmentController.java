package com.example.yanyue.controller;

import java.util.ArrayList;
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
     * 获取房间
     * 路径： /appartment/getAppartmentByExample
     * @Param page 当前页
     * @Param limit 每页大小
     * @Param appartmentVO 公寓视图对象,json数据,查询所有时不用传递数据
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
    @RequestMapping("/search")
    @ResponseBody
    @CrossOrigin
    public Result<List<AppartmentVO>>  search(@RequestParam(value = "page", defaultValue = "1", required = false) Integer currentPage,
                                              @RequestParam(value = "limit", defaultValue = "5", required = false) Integer pageSize,@RequestBody AppartmentVO appartmentVO){
        System.out.println("valueId:"+appartmentVO.getValueIds());
        System.out.println("clasId:"+appartmentVO.getClassIds());
        System.out.println("attrId:"+appartmentVO.getAttrIds());
        System.out.println("typeId:"+appartmentVO.getTypeIds());
        List<AppartmentVO> appartmentVOS=new ArrayList<>();

        return null;
    }
    /**
     * @Author yanyue
     * 根据主键删除公寓信息
     * 路径： /appartment/deleteByPrimaryKey
     * @Param appartmentId 公寓id
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
     * 更新公寓信息
     * 路径： /appartment/update
     * @Param appartment 公寓对象，json数据
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
     * 新增房间信息
     * 路径： /appartment/insert
     * @Param appartmentVO json对象
     * @return int 新增数据返回结果 <=0为失败
     **/
    @RequestMapping("/insert")
    @ResponseBody
    @CrossOrigin
    public int insert(@RequestBody AppartmentVO appartmentVO){
        if(appartmentVO==null||appartmentVO.getAppartmentName()==null||appartmentVO.getAppartmentName().length()==0){
            return -2;
        }else{
            return appartmentService.insertSelective(appartmentVO);
        }
    }

    /**
     * @Author yanyue
     * 获取公寓信息根据公寓id
     * 路径： /appartment/getInfoByAppartmentId
     * @Param appartmentId int公寓id，需要参数传递
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
