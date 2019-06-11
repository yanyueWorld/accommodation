package com.example.yanyue.dao;

import com.example.yanyue.pojo.Order;
import com.example.yanyue.pojo.vo.OrderVO;
import com.example.yanyue.pojo.vo.ReportVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<OrderVO> getAll(@Param("page") Integer currentPage,
                         @Param("limit") Integer pageSize,@Param("order") Order order);

    Order getTheMostInTheMonth();
    Order getTheMostInLastMonth();

    List<ReportVO> getSumByYear();

    List<ReportVO> getSumByMonth(Integer year);

    List<Integer> getYears();
}