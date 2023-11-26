package com.topsquad.ninzy.userservice.controller;


import com.topsquad.ninzy.userservice.service.abstracts.UserService;

import com.topsquad.ninzy.userservice.dto.UserRegisterRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/users/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("isExist/{userId}")
    public boolean isExists(@PathVariable String userId) {
        return userService.isUserExist(userId);
    }

    @PostMapping("add")
    public void addUser(@RequestBody UserRegisterRequestDto userRegisterRequestDto) {
        userService.addUser(userRegisterRequestDto);
    }

    @GetMapping("isUserCustomer")
    public boolean isUserCustomer() {
        return userService.isUserCustomer();
    }
    @GetMapping("isUserAdmin")
    public boolean isUserAdmin() {
        return userService.isUserAdmin();
    }
}