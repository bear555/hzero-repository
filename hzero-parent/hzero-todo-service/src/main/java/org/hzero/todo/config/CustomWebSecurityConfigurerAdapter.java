package org.hzero.todo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


//关闭 Spring Security 的安全配置，在 config 包下加入配置类，但不要把这个配置提交到 git 仓库，只适用于本地测试
//@Configuration
public class CustomWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // 禁用 security basic 验证
//        http.httpBasic().disable();
//        // 禁用 csrf
//        http.csrf().disable();
//    }
}
