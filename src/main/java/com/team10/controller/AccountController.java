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
    AccountService accountService;
    @PostMapping("/detail")
    public Result detail(Integer account_no){
        Account account = accountService.detail(account_no);
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
