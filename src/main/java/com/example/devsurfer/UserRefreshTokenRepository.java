package com.example.devsurfer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRefreshTokenRepository extends JpaRepository<UserRefreshToken, Long> {
    UserRefreshToken findByEmail(String email);
    UserRefreshToken findByEmailAndRefreshToken(String userId, String refreshToken);
}
