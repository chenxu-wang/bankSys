package com.team10.controller;

import com.team10.entity.User;
import com.team10.service.UserService;
import com.team10.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/create")
    public Result create(@RequestBody User user){
        userService.create(user);
        return Result.ok(user);
    }
}
