package com.tracker.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class TrackerApplication {

    @RequestMapping(value="/")
    public String index() {
        return "com.tracker.ui.index";
    }

	public static void main(String[] args) {
		SpringApplication.run(TrackerApplication.class, args);
	}
}
