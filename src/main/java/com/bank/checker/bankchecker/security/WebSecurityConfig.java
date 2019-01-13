package com.bank.checker.bankchecker.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${security.users.username}")
    private String userName;

    @Value("${security.users.userpassword}")
    private String userPassword;

    @Value("${security.users.adminname}")
    private String adminName;

    @Value("${security.users.adminpassword}")
    private String adminPassword;

    private final String ROLE_USER = "USER";
    private final String ROLE_ADMIN = "ADMIN";

    // For users and roles
    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser(adminName)
                    .password(passwordEncoder().encode(adminPassword))
                    .roles(ROLE_ADMIN)
                .and()
                .withUser(userName)
                    .password(passwordEncoder().encode(userPassword))
                    .roles(ROLE_USER);
    }

    // Url restrictions
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests()
            .antMatchers("/actuator/**").hasRole(ROLE_ADMIN)
            .antMatchers("/api/**").hasAnyRole(ROLE_USER, ROLE_ADMIN)
            .and()
            .httpBasic();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
