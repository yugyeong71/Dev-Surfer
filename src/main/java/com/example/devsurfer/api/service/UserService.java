package com.example.devsurfer.api.service;

import com.example.devsurfer.api.repository.UserRepository;
import com.example.devsurfer.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUser(String userId) {
        return userRepository.findByUserId(userId);
    }
}
