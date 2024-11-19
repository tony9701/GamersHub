package com.GamersHub.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String registerView() {
        System.out.print("TEST-VIEW");
        return "sign-in-up";
    }

    @PostMapping("/register")
    public String register() {
        System.out.print("TEST");
        return "sign-in-up";
    }
}
