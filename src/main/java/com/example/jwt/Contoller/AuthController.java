package com.example.JWT.Controller;

import com.example.JWT.Dto.LoginRequest;
import com.example.JWT.Utility.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @PostMapping({"/login"})
    public String login(@RequestBody LoginRequest request) {
        return "akilesh".equals(request.getUsername()) && "1234".equals(request.getPassword()) ? JwtUtil.generateToken(request.getUsername()) : "invalid credentials";
    }

    @GetMapping({"/hello"})
    public String hello(@RequestHeader("Authorization") String token) {
        String username = JwtUtil.validateToken(token.replace("Bearer", ""));
        return "hello" + username;
    }
}