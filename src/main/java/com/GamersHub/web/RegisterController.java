package com.GamersHub.web;

import com.GamersHub.model.dto.registerUserDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String registerView() {
        System.out.print("TEST-VIEW");
        return "sign-in-up";
    }

    @PostMapping("/register")
    public String register(@Valid registerUserDTO registerUserDTO, RedirectAttributes redirectAttributes) {
        System.out.print("TEST");
        return "sign-in-up";
    }
}
