package com.example.apilogin.Service;

import com.example.apilogin.Entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private static final String EXISTING_EMAIL = "test@test.com";
    private static final String ANOTHER_EMAIL = "next@test.com";
    public Optional<UserEntity> findByEmail(String email) {
        //TODO: Move this to database


        if (EXISTING_EMAIL.equalsIgnoreCase(email)) {

            var user = new UserEntity();
            user.setUserId(1L);
            user.setEmail(EXISTING_EMAIL);
            user.setPassword("$2a$12$4p5.WBaNX7eQU/BgFA7b9O6zvdiLsIxfJlo60ZOgK6tljiQMpml3i"); // "test"
            user.setRole("ROLE_ADMIN");
            user.setExtraInfo("My nice admin");
            return Optional.of(user);

        } else if (ANOTHER_EMAIL.equalsIgnoreCase(email)) {

            var user = new UserEntity();
            user.setUserId(99L);
            user.setEmail(ANOTHER_EMAIL);
            user.setPassword("$2a$12$4p5.WBaNX7eQU/BgFA7b9O6zvdiLsIxfJlo60ZOgK6tljiQMpml3i"); // "test"
            user.setRole("ROLE_USER");
            user.setExtraInfo("My nice user");
            return Optional.of(user);
        }

        return Optional.empty();
    }
}
