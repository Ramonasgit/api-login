package com.example.apilogin.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {
    @GetMapping("/")
    public String greeting (){
        return ("Hello! This is a test Page :-)");
    }
}
