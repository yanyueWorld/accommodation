package com.example.yanyue.dao;

import com.example.yanyue.pojo.Appartment;
import com.example.yanyue.pojo.vo.AppartmentVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName AppartmentDao
 * @Author yanyue
 * @Description 公寓数据操作接口
 * @Date 15:45 2019/3/25
 * @Version 1.0
 **/
public interface AppartmentDao {
    int deleteByPrimaryKey(Integer apartmentId);

    int insert(Appartment record);

    int insertSelective(Appartment record);

    Appartment selectByPrimaryKey(Integer apartmentId);

    int updateByPrimaryKeySelective(Appartment record);

    int updateByPrimaryKey(Appartment record);

    /**
     * @Author yanyue
     * @Description 获得公寓视图信息
     * @Date 15:46 2019/3/25
     * @Param Integer currentPage 当前页，Integer pageSize 页面大小，AppartmentVO 公寓视图
     * @return
     **/
    List<AppartmentVO> getAppartmentByExample(@Param("page") Integer currentPage,
                                              @Param("limit") Integer pageSize,AppartmentVO appartmentVO);
}