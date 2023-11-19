package com.ws.springsecurityworkshop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/public")
    public String _public() {
        return "Public";
    }

    @GetMapping("/private")
    public String _private() {
        return "Private";
    }

}


