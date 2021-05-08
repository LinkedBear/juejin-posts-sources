package com.linkedbear.spring.datasource.service;

import com.linkedbear.spring.datasource.config.RefreshDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.Map;

@Service
@RefreshDependency
public class DataSourceService {
    
    @Autowired
    Map<String, DataSource> dataSourceMap;
    
    public void printDataSources() {
        dataSourceMap.forEach((s, dataSource) -> {
            System.out.println(s + " ======== " + dataSource);
        });
    }
}
