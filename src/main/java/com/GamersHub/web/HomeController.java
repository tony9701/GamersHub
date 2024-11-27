package com.GamersHub.web;

import com.GamersHub.model.user.GamersHubUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();


        if (principal instanceof GamersHubUserDetails) { // if person is logged in
            model.addAttribute("username", ((GamersHubUserDetails) principal).getUsername());
            return "index";
        }

        return "redirect:/login"; }
}
