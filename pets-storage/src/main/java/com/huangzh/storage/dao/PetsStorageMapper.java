package com.huangzh.storage.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.huangzh.api.entity.PetsStorage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author huangzh
 * @version 2022/5/12
 * @Description
 * @Company zwx
 */
@Mapper
public interface PetsStorageMapper extends BaseMapper<PetsStorage> {
    /**
     * 分页查询指定行数据
     *
     * @param page 分页参数
     * @param wrapper 动态查询条件
     * @return 分页对象列表
     */
    IPage<PetsStorage> selectByPage(IPage<PetsStorage> page , @Param(Constants.WRAPPER) Wrapper<PetsStorage> wrapper);
}
