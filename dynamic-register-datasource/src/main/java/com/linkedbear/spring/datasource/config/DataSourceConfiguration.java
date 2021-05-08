package com.linkedbear.spring.datasource.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {
    
    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.db1")
    public DataSource db1() {
        System.out.println("db1 creating ......");
        return DataSourceBuilder.create().build();
    }
    
    @Bean
    @ConfigurationProperties("spring.datasource.db2")
    public DataSource db2() {
        System.out.println("db2 creating ......");
        return DataSourceBuilder.create().build();
    }
}
