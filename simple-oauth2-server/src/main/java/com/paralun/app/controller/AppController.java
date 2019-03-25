package com.paralun.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/rest")
public class AppController {

    @GetMapping("/principal")
    public Principal user(Principal principal) {
        return principal;
    }
}
