package com.linkedbear.spring.datasource.listener;

import com.linkedbear.spring.datasource.event.DynamicRegisterEvent;
import org.springframework.context.ApplicationListener;

public class DynamicRegisterDataSourceListener implements ApplicationListener<DynamicRegisterEvent> {
    
    @Override
    public void onApplicationEvent(DynamicRegisterEvent event) {
    
    }
}
