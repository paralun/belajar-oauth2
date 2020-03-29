package com.paralun.googlesso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String index(){
        return "Halo Semuanya...";
    }

    @GetMapping("/home")
    public String home(){
        return "Ini Home...";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Ini Admin...";
    }

}
