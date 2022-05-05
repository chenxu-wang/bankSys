package com.team10.mapper;

import com.team10.entity.User;

import java.util.Map;

public interface UserMapper {
    int create(User user);
    public User detail(Map<String,Object> paramMap);
}
