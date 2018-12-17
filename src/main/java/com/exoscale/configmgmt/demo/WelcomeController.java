package com.exoscale.configmgmt.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    private final Environment env;

    public WelcomeController(Environment env) {
        this.env = env;
    }

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("label", env.getProperty("app.env.label"));
        model.addAttribute("color", env.getProperty("app.env.color"));
        return "welcome";
    }
}
