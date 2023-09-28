package com.example.apilogin.Model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LoginRequests {
    public String email;
    public String password;

}
