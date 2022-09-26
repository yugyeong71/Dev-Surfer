package com.example.devsurfer.oauth;

import lombok.*;

import javax.persistence.Embeddable;
import java.security.AuthProvider;

@Getter @ToString
@Builder @Embeddable
@NoArgsConstructor @AllArgsConstructor
public class SocialAuth {

    private String providerId;

    private AuthProvider gitHub;

    private String email;

    private String name;
}
