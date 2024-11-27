package com.GamersHub.web;

import com.GamersHub.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        if (userService.isAuthenticated()) {
            return "redirect:/";
        }

        return "sign-in";
    }
}
