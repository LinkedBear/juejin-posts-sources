package com.linkedbear.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class MyBatisTransactionCacheApplication {
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MyBatisTransactionCacheApplication.class, args);
    }
}
