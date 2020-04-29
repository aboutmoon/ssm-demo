package com.demo.service;

import com.demo.pojo.Account;

import java.util.List;

public interface IAccountService {
    public List<Account> findAll();

    public void insert(Account account);
}
