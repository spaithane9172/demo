package com.portfolio.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MController {
    @RequestMapping("/")
    public String home() {
        return "navbar.html";
    }
}
