package com.demo.service.impl;

import com.demo.dao.AccountMapper;
import com.demo.pojo.Account;
import com.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> findAll() {
        System.out.println("find all account");
        return accountMapper.findAll();
    }

    @Override
    public void insert(Account account) {
        accountMapper.insert(account);
    }
}
