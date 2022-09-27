package com.example.devsurfer.oauth;

import java.util.Map;


public class GithubOAuth2UserInfo extends OAuth2UserInfo{

    public GithubOAuth2UserInfo(Map<String, Object> attributes){
        super((Map<String, Object>) attributes.get("response"));
    }

    @Override
    public String getId() {
        return (String) attributes.get("id");
    }

    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

    @Override
    public String getName() {
        return (String) attributes.get("name");
    }
}
