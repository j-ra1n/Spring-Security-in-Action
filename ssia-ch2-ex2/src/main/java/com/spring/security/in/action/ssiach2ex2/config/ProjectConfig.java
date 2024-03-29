package com.spring.security.in.action.ssiach2ex2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ProjectConfig /* extends WebSecurityConfigurerAdapter 5.7부터 제거됨 */ {


    @Bean
    public UserDetailsService userDetailsService() {
        var userDetailsService =
                new InMemoryUserDetailsManager();


        var user = User.withUsername("jw")  // 사용자 생성
                .password("0927")
                .authorities("read")
                .build();
        userDetailsService.createUser(user);

        return userDetailsService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {  // PasswordEncoder를 컨텍스트에 추가
        return NoOpPasswordEncoder.getInstance();
    }


    /*@Override
    protected void configure(HttpSecurity http) throws Exception {

        http.httpBasic();
        http.authorizeRequests()
                .anyRequest().permitAll();
    }*/
}
