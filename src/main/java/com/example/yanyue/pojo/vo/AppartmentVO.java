package com.example.yanyue.pojo.vo;

import com.example.yanyue.pojo.Picture;
import com.example.yanyue.pojo.Value;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName AppartmentVO
 * @Description 公寓视图对象
 * @Author yanyue
 * @Date 2019/3/27 10:56
 * @Version 1.0
 **/
@Setter
@Getter
@ToString
public class AppartmentVO {
    private Integer appartmentId;//公寓id
    private String appartmentName;//公寓名
    private BigDecimal price;//单价
    private String address;//地址
    private String  valueName;//属性值
    private String name;//房主
    private String typeName;//类型
    private String attrName;//属性
    private String className;//类别
    private BigDecimal beginPrice;//起始价格
    private BigDecimal endPrice;//终止价格
    private Integer status;//房间状态
    private Integer classId;//类别id
    private Integer typeId;//类型id
    private Integer attrId;//属性id
    private Integer[] valId;//属性值id
    private Integer owner;//房主账户id
    private Integer picId;//图片id
    private String picAddr;//图片地址
    private String picName;//图片名
    private List<Picture> pictures;//图片
    private List<Integer> valueIds;//属性值id
    private List<Integer> classIds;//类型id
    private List<Integer> typeIds;//类别id
    private List<Integer> attrIds;// 属性id


}
