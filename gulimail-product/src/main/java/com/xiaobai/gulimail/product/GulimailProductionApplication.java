package com.xiaobai.gulimail.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mrl
 * @data 2022/9/20
 */

@MapperScan("com.xiaobai.gulimail.product.dao")
@SpringBootApplication
public class GulimailProductionApplication {
    public static void main(String[] args) {
            SpringApplication.run(GulimailProductionApplication.class,args);
    }
}
