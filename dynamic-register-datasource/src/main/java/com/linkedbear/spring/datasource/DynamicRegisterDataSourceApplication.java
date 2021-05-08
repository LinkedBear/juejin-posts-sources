package com.linkedbear.spring.datasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
import java.util.Map;

@SpringBootApplication
public class DynamicRegisterDataSourceApplication {
    
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext ctx = SpringApplication.run(DynamicRegisterDataSourceApplication.class, args);
        Map<String, DataSource> dataSourceMap = ctx.getBeansOfType(DataSource.class);
        for (Map.Entry<String, DataSource> entry : dataSourceMap.entrySet()) {
            String name = entry.getKey();
            DataSource dataSource = entry.getValue();
            System.out.println(name);
            System.out.println(dataSource.getConnection());
        }
    }
}
