package com.example.devsurfer.config.security;

import com.example.devsurfer.oauth.token.AuthTokenProvider;
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
