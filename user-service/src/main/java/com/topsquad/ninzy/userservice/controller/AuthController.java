package com.topsquad.ninzy.userservice.controller;


import com.topsquad.ninzy.userservice.service.abstracts.AuthService;
import com.topsquad.ninzy.userservice.dto.UserAuthenticationResponseDto;
import com.topsquad.ninzy.userservice.dto.UserLoginRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public UserAuthenticationResponseDto login(@RequestBody UserLoginRequestDto userLoginRequestDto) {
        return authService.login(userLoginRequestDto);
    }
}
