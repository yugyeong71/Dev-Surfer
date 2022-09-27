package com.example.devsurfer.oauth;

import io.jsonwebtoken.Jwts;
import lombok.AllArgsConstructor;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;
import java.util.Date;

@AllArgsConstructor
@Service
public class TokenProvider {

    private AppProperties appProperties;

    public String creatToken(Authentication authentication){
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();

        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + appProperties.getAuth().getTokenExpirationTime());

        return Jwts.builder()
                .setS
    }
}
