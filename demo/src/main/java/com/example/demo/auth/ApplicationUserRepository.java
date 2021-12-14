package com.example.demo.auth;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicationUserRepository {

    Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
