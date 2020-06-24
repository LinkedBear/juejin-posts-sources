package com.linkedbear.demo.config.shiro;

import com.linkedbear.demo.service.DemoService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import java.util.Arrays;

public class CustomRealm extends AuthorizingRealm {
    
    @Autowired
//    @Lazy
    DemoService demoService;
    
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        if (token.getPrincipal() == null) {
            return null;
        }
        String name = token.getPrincipal().toString();
        // 请求数据库查询是否存在用户，这里省略
        return new SimpleAuthenticationInfo(name, "123456", getName());
    }
    
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        // 请求数据库/缓存加载用户的权限，这里暂时使用一组假数据
        authorizationInfo.addStringPermissions(Arrays.asList("aa", "bb", "cc"));
        return authorizationInfo;
    }
}