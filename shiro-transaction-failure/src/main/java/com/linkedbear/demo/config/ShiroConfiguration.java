package com.linkedbear.demo.config;

import com.linkedbear.demo.config.shiro.CustomRealm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfiguration {
    
    // 自定义Realm注册
    @Bean
    public CustomRealm authorizer() {
        return new CustomRealm();
    }
    
    // 动态代理创建器（上面没有导入AOP）
    @Bean
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }
    
    // 过滤器定义，此处选择全部放行，方便调试
    @Bean
    public ShiroFilterChainDefinition filterChainDefinition() {
        DefaultShiroFilterChainDefinition filterChainDefinition = new DefaultShiroFilterChainDefinition();
        filterChainDefinition.addPathDefinition("/**", "anon");
        return filterChainDefinition;
    }
}