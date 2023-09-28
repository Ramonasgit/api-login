package com.example.apilogin.Controller;

import com.example.apilogin.Model.LoginRequests;
import com.example.apilogin.Model.LoginResponse;
import com.example.apilogin.Service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/auth/login")
    public LoginResponse login(@RequestBody @Validated LoginRequests request) {
        return authService.attemptLogin(request.getEmail(), request.getPassword());
    }
}