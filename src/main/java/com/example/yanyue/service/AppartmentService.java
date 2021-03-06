package com.example.yanyue.service;

import com.example.yanyue.pojo.Appartment;
import com.example.yanyue.pojo.vo.AppartmentVO;

import java.util.List;

/**
 * @ClassName AppartmentService
 * @Description 公寓业务处理接口
 * @Author yanyue
 * @Date 2019/3/27 11:15
 * @Version 1.0
 **/
public interface AppartmentService {

    List<Appartment> getAll(Integer currentPage, Integer pageSize,AppartmentVO appartmentVO);

    int deleteByPrimaryKey(Integer appartmentId);

    int updateByPrimaryKeySelective(AppartmentVO appartment);

    int insertSelective(AppartmentVO appartmentVO);

    AppartmentVO getInfoByAppartmentId(Integer appartmentId);

    Appartment getTheMostInTheMonth();
    Appartment getTheMostInLastMonth();


}
