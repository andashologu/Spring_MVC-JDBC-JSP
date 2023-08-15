package com.example.springboot.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*; 
import org.springframework.security.authentication.dao.*; 
import org.springframework.security.config.annotation.authentication.builders.*; 
import org.springframework.security.config.annotation.web.builders.*; 
import org.springframework.security.config.annotation.web.configuration.*; 
import org.springframework.security.core.userdetails.*; 
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.springboot.Security.LoginFailureHandler;
import com.example.springboot.Services.Security.UserInfoService;

@Configuration @EnableWebSecurity public class WebSecurityConfig extends WebSecurityConfigurerAdapter { 
    @Autowired
    private LoginFailureHandler failureHandler;
    
    @Bean 
    public UserDetailsService userDetailsService() { 
        return new UserInfoService(); 
    }

    @Bean
    BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    } 
    @Override 
    protected void configure(AuthenticationManagerBuilder auth) throws Exception { 
        auth.authenticationProvider(authenticationProvider()); 
    } 
    @Override protected void configure(HttpSecurity http) throws Exception { 
        http.authorizeRequests()
            .antMatchers( "/**").permitAll()
            .and() 
            .formLogin()
            .loginPage("/login").permitAll()//support POST method
            .successForwardUrl("/login_success_handler")//support POST method
            .failureHandler(failureHandler)
            .and() 
            .logout()
            .logoutSuccessUrl("/").permitAll()
            .and()
            .csrf().disable();
    } 
}