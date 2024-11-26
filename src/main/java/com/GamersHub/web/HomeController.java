package com.GamersHub.web;

import com.GamersHub.model.user.UserDetails;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Principal principal, Model model) {
        if (principal != null) { // if person is logged in
//            model.addAttribute("userDetails", principal);
            return "index";
        }

        return "redirect:/login"; }
}
