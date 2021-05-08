package com.linkedbear.spring.datasource.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class DynamicRegisterEvent extends ApplicationContextEvent {
    
    public DynamicRegisterEvent(ApplicationContext source) {
        super(source);
    }
}
