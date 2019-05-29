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
    /**
     * 根据主键删除公寓id
     * @param apartmentId
     * @return
     */
    int deleteByPrimaryKey(Integer apartmentId);

    /**
     * 新增公寓信息
     * @param record
     * @return
     */
    int insert(Appartment record);

    /**
     * 新增公寓信息，信息可以为空
     * @param record
     * @return
     */
    int insertSelective(Appartment record);

    /**
     * 修改公寓信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(AppartmentVO record);


    /**
     * @Author yanyue
     * @Description 获得公寓视图信息
     * @Date 15:46 2019/3/25
     * @Param Integer currentPage 当前页，Integer pageSize 页面大小，AppartmentVO 公寓视图
     * @return
     **/
    List<AppartmentVO> getAppartmentByExample(@Param("page") Integer currentPage,
                                              @Param("limit") Integer pageSize,AppartmentVO appartmentVO);

    /**
     * @Author yanyue
     * @Description 获取公寓详细信息
     * @param appartmentId 公寓id
     * @return
     */
    AppartmentVO getInfoByAppartmentId(Integer appartmentId);

    List<Appartment> getAll(@Param("page") Integer currentPage,@Param("limit") Integer pageSize,AppartmentVO appartmentVO);

}