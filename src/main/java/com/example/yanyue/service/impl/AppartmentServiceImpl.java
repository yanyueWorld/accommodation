package com.example.yanyue.service.impl;

import java.util.List;

import com.example.yanyue.pojo.Appartment;
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

    @Override
    public int deleteByPrimaryKey(Integer appartmentId) {
        if(appartmentId==null||appartmentId==0){
            return -1;
        }else{
            return appartmentDao.deleteByPrimaryKey(appartmentId);
        }
    }

    @Override
    public int updateByPrimaryKeySelective(AppartmentVO appartment) {
        if(appartment.getAppartmentId()==null||appartment.getAppartmentId()==0){
            return -1;
        }else{
            return appartmentDao.updateByPrimaryKeySelective(appartment);
        }
    }

    @Override
    public int insertSelective(Appartment appartment) {
        if(appartment==null||(appartment.getApartmentName()==null||appartment.getApartmentName().length()==0)){
            return -1;
        }else{
            return appartmentDao.insertSelective(appartment);
        }
    }

    @Override
    public AppartmentVO getInfoByAppartmentId(Integer appartmentId) {
        if(appartmentId==null||appartmentId==0){
            return new AppartmentVO();
        }else {
            return appartmentDao.getInfoByAppartmentId(appartmentId);
        }
    }


}
