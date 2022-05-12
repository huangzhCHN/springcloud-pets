package com.huangzh.storage.controller;

import com.huangzh.api.entity.PetsStorage;
import com.huangzh.api.service.IStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author huangzh
 * @version 2022/5/12
 * @Description
 * @Company zwx
 */
@RestController
@RequestMapping("storage")
public class StorageController {

    @Autowired
    private IStorageService storageService;


    @GetMapping("get/{id}")
    public ResponseEntity queryById(Long id){
        return ResponseEntity.ok(storageService.queryById(id));
    }

    @PostMapping("add")
    public ResponseEntity add(@RequestBody PetsStorage storage){
        Integer value = Optional.of(storageService.insert(storage)).orElse(0);
        return value <= 0 ? ResponseEntity.ok("error") : ResponseEntity.ok("success");
    }
}
