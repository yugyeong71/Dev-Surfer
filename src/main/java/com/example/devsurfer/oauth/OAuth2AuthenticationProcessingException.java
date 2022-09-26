package com.example.devsurfer.oauth;

import javax.naming.AuthenticationException;

public class OAuth2AuthenticationProcessingException extends AuthenticationException {

    public OAuth2AuthenticationProcessingException(String msg){
        super(msg);
    }

    public OAuth2AuthenticationProcessingException(String msg, Throwable t){
        super(msg, t);
    }
}
