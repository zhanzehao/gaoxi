package com.zhanzeh.gaoxicontroller.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhanzeh.gaoxicommonservicefacade.api.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerImpl implements UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/login")
    public String login(String username,String password) {
        return userService.login(username,password);
    }
}
