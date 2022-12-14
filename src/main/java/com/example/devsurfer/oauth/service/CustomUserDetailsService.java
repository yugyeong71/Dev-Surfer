package com.example.devsurfer.oauth.service;

import com.example.devsurfer.api.repository.UserRepository;
import com.example.devsurfer.oauth.entity.UserPrincipal;
import com.example.devsurfer.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserId(username);

        if(user == null){
            throw new UsernameNotFoundException("Can not find username.");
        }
        return UserPrincipal.create(user);
        }
}
