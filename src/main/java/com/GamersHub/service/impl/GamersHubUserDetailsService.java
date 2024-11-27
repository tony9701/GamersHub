package com.GamersHub.service.impl;
import com.GamersHub.model.entity.UserEntity;
import com.GamersHub.model.entity.UserRole;
import com.GamersHub.model.user.GamersHubUserDetails;
import com.GamersHub.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public class GamersHubUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public GamersHubUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
         return userRepository
                .findByEmail(email)
                .map(GamersHubUserDetailsService::map)
                .orElseThrow(() -> new UsernameNotFoundException("User with email " + email + " not found!"));

    }

    private static GamersHubUserDetails map(UserEntity user) {


        return new GamersHubUserDetails(
                user.getEmail(),
                user.getPassword(),
                List.of() //TODO
        );

    }
}

