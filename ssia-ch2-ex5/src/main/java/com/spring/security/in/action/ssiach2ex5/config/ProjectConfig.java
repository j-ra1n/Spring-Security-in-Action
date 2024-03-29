package com.spring.security.in.action.ssiach2ex5.config;

import com.spring.security.in.action.ssiach2ex5.security.CustomAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class ProjectConfig extends /* WebSecurityConfigurerAdapter 5.7부터 삭제*/ {

    @Autowired
    private CustomAuthenticationProvider authenticationProvider;

   /* @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authenticationProvider);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        http.authorizeRequests()
                .anyRequest().authenticated();
    }*/
}
