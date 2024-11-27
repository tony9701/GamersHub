package com.GamersHub.service.impl;

import com.GamersHub.model.dto.registerUserDTO;
import com.GamersHub.model.entity.UserEntity;
import com.GamersHub.model.user.GamersHubUserDetails;
import com.GamersHub.repository.UserRepository;
import com.GamersHub.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void registerUser(registerUserDTO registerUserDTO) {
        userRepository.save(map(registerUserDTO));
    }

    @Override
    public boolean isAuthenticated() {
        return getPrincipal() instanceof UserDetails;
    }

    @Override
    public String getCurrentUsername() {
        return ((GamersHubUserDetails)getPrincipal()).getUsername();
    }


    private UserEntity map(registerUserDTO registerUserDTO) {
        UserEntity user = modelMapper.map(registerUserDTO, UserEntity.class);
        user.setPassword(passwordEncoder.encode(registerUserDTO.getPassword()));
        return user;
    }

    private static Object getPrincipal() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
