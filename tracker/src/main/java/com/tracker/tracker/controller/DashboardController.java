package com.tracker.tracker.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

    @RequestMapping(value="/")
    public String dashboard(final Model model) {
        model.addAttribute("name", "tracker");
        model.addAttribute("greetingWord", "Hello");
        return "com.tracker.ui.dashboard";
    }
}
