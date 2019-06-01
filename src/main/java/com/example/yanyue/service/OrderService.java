package com.example.yanyue.service;

import com.example.yanyue.pojo.Order;
import com.example.yanyue.pojo.vo.OrderVO;
import com.example.yanyue.pojo.vo.ReportVO;

import java.util.List;

public interface OrderService {

    List<OrderVO> getAll(Integer currentPage,Integer pageSize,Order order);
    int update(Order order);
    int delete(Order order);
    int insert(Order order);
    List<ReportVO> getSumByYear();
    List<ReportVO> getSumByMonth(Integer year);
    List<Integer> getYears();
}
