package com.team10.controller;

import com.team10.entity.User;
import com.team10.service.UserService;
import com.team10.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public Result create(@RequestBody User user) {
        user.setBalance(0);
        userService.create(user);
        return Result.ok(user);
    }
    @PostMapping("/query")
    public Result query(@RequestBody Map<String,String> map) {
        Integer id = Integer.parseInt(map.get("id"));
        Double balance = userService.query(id);
        return Result.ok(balance);
    }
}
