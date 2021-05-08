package com.linkedbear.spring.datasource.event;

import com.linkedbear.spring.datasource.config.RefreshDependency;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class DynamicRegisterListener implements ApplicationListener<DynamicRegisterEvent> {
    
    @Override
    public void onApplicationEvent(DynamicRegisterEvent event) {
        ApplicationContext ctx = event.getApplicationContext();
        AutowireCapableBeanFactory beanFactory = ctx.getAutowireCapableBeanFactory();
        Map<String, Object> beansMap = ctx.getBeansWithAnnotation(RefreshDependency.class);
        beansMap.values().forEach(beanFactory::autowireBean);
    }
}
