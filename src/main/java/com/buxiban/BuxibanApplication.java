package com.buxiban;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Package: com.buxiban
 * @Author: ch3nw3i@github
 * @Date: 2020-04-26 22:18
 */
@SpringBootApplication
@MapperScan(value = "com.buxiban.**.mapper")
public class BuxibanApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuxibanApplication.class, args);
    }
}
