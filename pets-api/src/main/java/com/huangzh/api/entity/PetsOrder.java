package com.huangzh.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

/**
 * 宠物订单;
 * @author : http://www.chiner.pro
 * @date : 2022-5-12
 */
@TableName("pets_order")
public class PetsOrder implements Serializable,Cloneable{
    /** 租户号 */
    private String tenantId ;
    /** 乐观锁 */
    private String revision ;
    /** 创建人 */
    private String createdBy ;
    /** 创建时间 */
    private Date createdTime ;
    /** 更新人 */
    private String updatedBy ;
    /** 更新时间 */
    private Date updatedTime ;
    /** 唯一业务ID */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id ;
    /** 订单编码 */
    private Long orderId ;
    /** 库存ID */
    private Long storageId ;
    /** 订单数量 */
    private Integer orderNum ;

}