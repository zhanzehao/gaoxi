package com.zhanzeh.gaoxiuser.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhanzeh.gaoxicommonservicefacade.api.UserService;

@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

    public String login(String username,String password) {
        return "login success!";
    }
}
