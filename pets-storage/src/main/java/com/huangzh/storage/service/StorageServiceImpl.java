package com.huangzh.storage.service;

import com.huangzh.storage.dao.PetsStorageMapper;
import com.huangzh.api.entity.PetsStorage;
import com.huangzh.api.service.IStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huangzh
 * @version 2022/5/12
 * @Description
 * @Company zwx
 */
@Service
public class StorageServiceImpl implements IStorageService {
    @Autowired
    private PetsStorageMapper mapper;

    @Override
    public PetsStorage queryById(Long id){
        return mapper.selectById(id);
    }

    @Override
    public int insert(PetsStorage storage){
        return mapper.insert(storage);
    }
}
