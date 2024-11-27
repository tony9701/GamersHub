package com.GamersHub.web;

import com.GamersHub.model.user.GamersHubUserDetails;
import com.GamersHub.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home(Model model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();


        if (userService.isAuthenticated()) { // if person is logged in
            String currentUsername = userService.getCurrentUsername();
            model.addAttribute("username", currentUsername);
            return "index";
        }

        return "redirect:/login";
    }
}
