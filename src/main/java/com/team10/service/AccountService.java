package com.team10.service;

import com.team10.entity.Account;
import com.team10.mapper.AccountMapper;
import com.team10.utils.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;
    public int create(Account account) {
        return this.accountMapper.create(account);
    }
    public int update(Account account){
        return accountMapper.update(Maps.build(account.getAccountNo()).beanToMapForUpdate(account));
    }
    public Account detail(Integer account_no){
        return accountMapper.detail(Maps.build(account_no).getMap());
    }


}
