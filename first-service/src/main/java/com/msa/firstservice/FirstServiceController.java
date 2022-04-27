package com.msa.firstservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstServiceController {
    @GetMapping("/welcome")
    pubilc String welcome() {
        return "Welcome to the First service.";
    }
}
