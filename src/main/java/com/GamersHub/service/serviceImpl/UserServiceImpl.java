package com.GamersHub.service.serviceImpl;

import com.GamersHub.model.dto.registerUserDTO;
import com.GamersHub.model.entity.User;
import com.GamersHub.repository.UserRepository;
import com.GamersHub.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void registerUser(registerUserDTO registerUserDTO) {
        userRepository.save(map(registerUserDTO));
    }



    private User map(registerUserDTO registerUserDTO) {
        User map = modelMapper.map(registerUserDTO, User.class);
        System.out.printf("");
        return map;
        //TODO finish the register method

        //TODO encode the password and set it
    }
}
