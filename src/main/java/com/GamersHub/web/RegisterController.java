package com.GamersHub.web;

import com.GamersHub.model.dto.registerUserDTO;
import com.GamersHub.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegisterController {

    private final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/register")
    public String registerView() {
        if (userService.isAuthenticated()) {
            return "redirect:/";
        }

        return "register";
    }

    @PostMapping("/register")
    public String register(@Valid registerUserDTO registerUserDTO, RedirectAttributes redirectAttributes) {
        userService.registerUser(registerUserDTO);
        return "redirect:/login";
    }
}
