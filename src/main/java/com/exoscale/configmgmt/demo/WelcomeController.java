package com.exoscale.configmgmt.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    private final ApplicationEnvironmentProperties props;

    public WelcomeController(ApplicationEnvironmentProperties props) {
        this.props = props;
    }

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("label", props.getEnv().getLabel());
        model.addAttribute("color", props.getEnv().getColor());
        return "welcome";
    }
}
