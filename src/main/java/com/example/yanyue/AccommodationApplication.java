package com.example.yanyue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.example.yanyue.dao")
@EnableCaching
public class AccommodationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccommodationApplication.class, args);
    }

}
