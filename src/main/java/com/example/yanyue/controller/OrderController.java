package com.example.yanyue.controller;

import com.example.yanyue.pojo.Order;
import com.example.yanyue.pojo.common.Result;
import com.example.yanyue.pojo.vo.OrderVO;
import com.example.yanyue.pojo.vo.ReportVO;
import com.example.yanyue.service.OrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * @Author yanyue
     * 获取所有订单
     * 路径： /order/getAll
     * @Param page 当前页
     * @Param limit 页面大小
     * @Param order订单对象,json数据,查询所有时不用传参
     * @return com.example.yanyue.pojo.common.Result<java.util.List < com.example.yanyue.pojo.vo.OrderVO>> 封装的订单视图结果json对象
     **/
    @RequestMapping("/getAll")
    @ResponseBody
    @CrossOrigin
    public Result<List<OrderVO>> getAll(@RequestParam(value = "page", defaultValue = "1", required = false) Integer currentPage,
                                @RequestParam(value = "limit", defaultValue = "5", required = false) Integer pageSize,@RequestBody Order order){
        List<OrderVO> orderVOS=orderService.getAll(currentPage,pageSize,order);
        if(orderVOS==null||orderVOS.size()==0){
            orderVOS=new ArrayList<>();
        }
        Result<List<OrderVO>> result = Result.success(orderVOS);
        PageInfo<OrderVO> pageInfo = new PageInfo<>(orderVOS);
        result.setCount(pageInfo.getTotal());
        return result;
    }

    /**
     * @Author yanyue
     * 新增订单
     * 路径： /order/insert
     * @Param order 订单对象,json格式
     * @return int 新增数据结果 <=0为失败
     **/
    @RequestMapping("/insert")
    @ResponseBody
    @CrossOrigin
    public int add(@RequestBody Order order){
        if(order==null||order.getAccountId()==null||order.getAccountId()==0||order.getApartmentId()==null||order.getAccountId()==0) {
            return -2;
        }else{
            return orderService.insert(order);
        }
    }

    /**
     * @Author yanyue
     * 订单修改
     * 路径： /order/insert
     * @Param order 订单对象的json数据
     * @return int
     **/
    @RequestMapping("/update")
    @ResponseBody
    @CrossOrigin
    public int update(@RequestBody Order order){
        if(order==null||order.getOrderId()==null||order.getOrderId()==0){
            return -2;
        }else{
            return orderService.update(order);
        }
    }

    /**
     * @Author yanyue
     * 订单关闭
     * 路径：/order/delete
     * @Param order 订单对象 json数据
     * @return int 关闭订单操作结果 <=0为失败
     **/
    @RequestMapping("/delete")
    @ResponseBody
    @CrossOrigin
    public int delete(@RequestBody  Order order){
        if(order==null||order.getOrderId()==null||order.getOrderId()==0){
            return -2;
        }else{
            return orderService.delete(order);
        }
    }

    @RequestMapping("/getSumByMonth")
    @ResponseBody
    @CrossOrigin
    public List<ReportVO> getSumByMonth(Integer year){
        if(year==null||year==0){
            year=2019;
        }
        System.out.println(orderService.getSumByMonth(year));
        return orderService.getSumByMonth(year);
    }
    @RequestMapping("/getSumByYear")
    @ResponseBody
    @CrossOrigin
    public List<ReportVO> getSumByYear(){
        return orderService.getSumByYear();
    }

    @RequestMapping("/getYears")
    @ResponseBody
    @CrossOrigin
    public  List<Integer> getYears(){
        List<Integer> years=orderService.getYears();
        years.removeAll(Collections.singleton(null));
        return years;
    }
}
