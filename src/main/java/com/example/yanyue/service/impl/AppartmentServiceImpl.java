package com.example.yanyue.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.yanyue.dao.AttrValAppartmentDao;
import com.example.yanyue.dao.AttrValDao;
import com.example.yanyue.pojo.Appartment;
import com.example.yanyue.pojo.AttrVal;
import com.example.yanyue.pojo.AttrValAppartment;
import com.example.yanyue.pojo.Value;
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
    @Autowired
    private AttrValAppartmentDao attrValAppartmentDao;
    @Autowired
    private AttrValDao attrValDao;

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
    public int insertSelective(AppartmentVO appartmentVO) {
        if(appartmentVO==null||(appartmentVO.getAppartmentName()==null||appartmentVO.getAppartmentName().length()==0)){
            return 0;
        }
        Appartment appartment=new Appartment();
        appartment.setApartmentName(appartmentVO.getAppartmentName());
        appartment.setPrice(appartmentVO.getPrice());
        appartment.setAddress(appartmentVO.getAddress());
        appartment.setStatus(0);
        appartment.setTypeId(appartmentVO.getTypeId());
        appartment.setAttrId(appartmentVO.getAttrId());
        appartment.setOwner(appartmentVO.getOwner());
        int dao=appartmentDao.insertSelective(appartment);
        if(dao<=0){
            return -1;
        }

        List<AppartmentVO> appartmentResults=appartmentDao.getAppartmentByExample(null,null,appartmentVO);

        Integer appartmentId=new Integer(0);
        for(int i=0;i<appartmentResults.size();i++){
            appartmentId=appartmentResults.get(i).getAppartmentId();
        }
        Integer[] valueId=appartmentVO.getValId();
        System.out.println(appartmentId);

        Integer attrId=appartment.getAttrId();
        System.out.println(attrId);
        List<Integer> attrValIds=new ArrayList<>();
        for(int i=0;i<valueId.length;i++){
            AttrVal attrVal=new AttrVal();
            attrVal.setAttrId(attrId);
            attrVal.setValId(valueId[i]);
            attrValIds.add(attrValDao.getAttrValId(attrVal));
        }
        System.out.println(attrValIds);
        AttrValAppartment attrValAppartment=new AttrValAppartment();
        for(int i=0;i<attrValIds.size();i++){
            attrValAppartment.setAppartmentId(appartmentId);
            attrValAppartment.setAttrValId(attrValIds.get(i));
            if(attrValAppartmentDao.add(attrValAppartment)<=0){
                return -2;
            }
        }
        return 1;
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
