package com.example.devsurfer.oauth;

import lombok.*;

import javax.persistence.Embeddable;
import java.security.AuthProvider;
import java.util.Map;

@Getter @ToString
@Builder @Embeddable
@NoArgsConstructor @AllArgsConstructor
public class SocialAuth {

    private String providerId;

    private AuthProvider github;

    private String email;

    private String name;

    private String attributes;

    private String ip;

    public void update(String name, Map<String, Object> attributes){
        this.name = name;
        this.attributes = attributes.toString();
    }
}
