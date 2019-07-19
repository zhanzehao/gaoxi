package com.zhanzeh.gaoxicontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserController {

    @GetMapping("/login")
    String login(String username, String password);
}
