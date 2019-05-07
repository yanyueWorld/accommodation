package com.example.yanyue.service.impl;

import com.example.yanyue.dao.ApartmentPicDao;
import com.example.yanyue.dao.PictureDao;
import com.example.yanyue.pojo.ApartmentPic;
import com.example.yanyue.pojo.Picture;
import com.example.yanyue.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureDao pictureDao;
    @Autowired
    private ApartmentPicDao apartmentPicDao;
    @Override
    public int insert(Picture picture,Integer appartmentId) {
        if(picture.getPicAddr()==null||picture.getPicAddr().length()==0||appartmentId==null||appartmentId==0){
            return -4;
        }
        if(pictureDao.insert(picture)<=0){
            return -2;
        }
        List<Picture> pictures=pictureDao.getAll(picture);
        Integer pictureId=pictures.get(0).getPicId();
        ApartmentPic apartmentPic=new ApartmentPic();
        apartmentPic.setPicId(pictureId);
        apartmentPic.setApartmentId(appartmentId);
        if(apartmentPicDao.insert(apartmentPic)<=0){
            return -1;
        }
        return 1;
    }
}
