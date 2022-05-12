package com.huangzh.storage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author huangzh
 * @version 2022/5/12
 * @Description
 * @Company zwx
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.huangzh.storage"})
@ComponentScan(basePackages = {"com.huangzh"})
public class StorageApplication {
    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class);
    }
}
