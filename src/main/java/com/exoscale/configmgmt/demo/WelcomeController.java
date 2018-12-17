package com.exoscale.configmgmt.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @Value("${app.env.label}")
    private String label;

    @Value("${app.env.color}")
    private String color;

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("label", label);
        model.addAttribute("color", color);
        return "welcome";
    }
}
