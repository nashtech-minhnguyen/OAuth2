package com.example.demo.securityconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain getConfigSecurity(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(auth -> {
            auth.antMatchers("/").permitAll();
            auth.anyRequest().authenticated();
        }).oauth2Login().and().formLogin().and().build();
    }

}
