package com.example.yanyue.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.yanyue.dao.AppartmentDao;
import com.example.yanyue.pojo.vo.AppartmentVO;
import com.example.yanyue.service.AppartmentService;

/**
 * @ClassName AppartmentServiceImpl
 * @Description 公寓业务处理接口实现类
 * @Author yanyue
 * @Date 2019/3/27 11:18
 * @Version 1.0
 **/
@Service
public class AppartmentServiceImpl implements AppartmentService {

    @Autowired
    private AppartmentDao appartmentDao;

    @Override
    public List<AppartmentVO> getAppartmentByExample(Integer currentPage, Integer pageSize,AppartmentVO appartmentVO) {
        List<AppartmentVO> appartmentVOS = appartmentDao.getAppartmentByExample(currentPage,
                pageSize,appartmentVO);

        return appartmentVOS;
    }
}
