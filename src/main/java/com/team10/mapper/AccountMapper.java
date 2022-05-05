package com.team10.mapper;

import com.team10.entity.Account;

import java.util.Map;

public interface AccountMapper {
    public Account detail(Map<String,Object> paramMap);
    public int create(Account account);
    public int update(Map<String, Object> paramMap);
}
