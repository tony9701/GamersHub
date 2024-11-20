package com.GamersHub.service.impl;
import com.GamersHub.model.entity.User;
import com.GamersHub.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Optional;

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

    private static UserDetails map(User user) {


//        org.springframework.security.core.userdetails.User.withUsername(user.getEmail())
//                .password(user.getPassword())
//                .authorities(List.of())
//                .disabled(false)
//                .build();

//TODO finish the config
    }
}
