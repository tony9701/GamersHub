package com.GamersHub.service;

import com.GamersHub.model.dto.registerUserDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void registerUser(registerUserDTO registerUserDTO);
}
