package com.team10.service;

import com.team10.entity.User;
import com.team10.mapper.UserMapper;
import com.team10.utils.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User login(String username, String password){
        return userMapper.detail(Maps.build().put("username",username).put("password",password).getMap());
    }
    public int create(User user) {
        return this.userMapper.create(user);
    }

}
