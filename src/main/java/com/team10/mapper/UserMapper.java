package com.team10.mapper;

import com.team10.entity.User;

import java.util.Map;

public interface UserMapper {
    public User detail(Map<String,Object> paramMap);
    public int create(User user);
    public Double query(int id);

}
