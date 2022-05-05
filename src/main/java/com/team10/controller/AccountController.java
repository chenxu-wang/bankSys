package com.team10.controller;

import com.team10.entity.Account;
import com.team10.service.AccountService;
import com.team10.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @PostMapping("/detail")
    public Result detail(Integer accountNo){
        Account account = accountService.detail(accountNo);
        return Result.ok(account);
    }
    @PostMapping("/create")
    public Result create(@RequestBody Account account){
        accountService.create(account);
        return Result.ok(account);
    }
    @PostMapping("/update")
    public Result update(@RequestBody Account account){
        accountService.update(account);
        return Result.ok(account);
    }
}
