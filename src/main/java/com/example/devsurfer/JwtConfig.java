package com.example.devsurfer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {

    @org.springframework.beans.factory.annotation.Value("${jwt.secret}")
    private String secret;

    @Bean
    public AuthTokenProvider jwtProvider(){
        return new AuthTokenProvider(secret);
    }
}
