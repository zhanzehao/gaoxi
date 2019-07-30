package com.zhanzeh.gaoxicontroller.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserController {
    String login(String username, String password);
}
