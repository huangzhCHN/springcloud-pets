package com.huangzh.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;


/**
 * 宠物库存;
 * @author : http://www.chiner.pro
 * @date : 2022-5-12
 */
@TableName("pets_storage")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PetsStorage implements Serializable,Cloneable{
    /** 租户号 */
    private String tenantId;
    /** 乐观锁 */
    private String revision;
    /** 创建人 */
    private String createdBy;
    /** 创建时间 */
    private Date createdTime;
    /** 更新人 */
    private String updatedBy;
    /** 更新时间 */
    private Date updatedTime;
    /** 业务ID */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id ;
    /** 宠物名称 */
    private String petsName;
    /** 库存数量 */
    private Long storgaeNum;
}