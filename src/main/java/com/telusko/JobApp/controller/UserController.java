package com.telusko.JobApp.controller;

import com.telusko.JobApp.model.User;
import com.telusko.JobApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("register")
    public User registerUser(@RequestBody User user){
        return userService.registeruser(user);
    }
}