package com.example.apilogin.Controller;

import com.example.apilogin.Security.UserPrincipal;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {
    @GetMapping("/")
    public String greeting (){
        return ("Hello! This is a test Page :-)");
    }

    @GetMapping("/secured")
    public String secured(@AuthenticationPrincipal UserPrincipal principal) {
        return "If you can see this, you're logged in as " + principal.getEmail() + "UserId: "
                + principal.getUserId();
    }

    @GetMapping("/admin")
    public String admin(@AuthenticationPrincipal UserPrincipal principal){
        return "If you see this, you are an admin. UserID: " + principal.getUserId();
    }
}
