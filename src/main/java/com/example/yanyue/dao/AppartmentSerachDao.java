package com.example.yanyue.dao;

import com.example.yanyue.pojo.vo.AppartmentVO;

import java.util.List;

public interface AppartmentSerachDao {
    List<AppartmentVO> getAppartmentByValueIds(Integer ValueId);
    /*List<AppartmentVO> getAppartmentByClassIds(Integer classId);
    List<AppartmentVO> getAppartmentByAttrIds(Integer attrId);
    List<AppartmentVO> getAppartmentByTypeIds(Integer typeId);*/
}
