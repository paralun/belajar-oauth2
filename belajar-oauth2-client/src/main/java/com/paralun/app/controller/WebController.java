package com.paralun.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class WebController {

    @GetMapping("/securedPage")
    public String securedPage(Model model, Principal principal) {
        return "securedPage";
    }

    @GetMapping("/")
    public String index(Model model, Principal principal) {
        return "index";
    }
}
