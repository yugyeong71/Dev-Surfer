package com.example.devsurfer.oauth.info;

import com.example.devsurfer.oauth.info.impl.GithubOAuth2UserInfo;
import com.example.devsurfer.oauth.entity.ProviderType;

import java.util.Map;

public class OAuth2UserInfoFactory {
    public static OAuth2UserInfo getOAuth2UserInfo(ProviderType providerType, Map<String, Object> attributes){
        switch (providerType){
            case GITHUB: return new GithubOAuth2UserInfo(attributes);
            default: throw new IllegalArgumentException("Invalid Provider Type.");
        }
    }
}
