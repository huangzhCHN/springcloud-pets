package com.huangzh.api.service;

import com.huangzh.api.entity.PetsStorage;

/**
 * @author huangzh
 * @version 2022/5/12
 * @Description
 * @Company zwx
 */
public interface IStorageService {
    PetsStorage queryById(Long id);

    int insert(PetsStorage storage);
}
