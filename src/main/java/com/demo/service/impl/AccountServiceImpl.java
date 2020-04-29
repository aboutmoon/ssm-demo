package com.demo.service.impl;

import com.demo.dao.IAccountDao;
import com.demo.domain.Account;
import com.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("发ian all account");
        return accountDao.findAll();
    }

    @Override
    public void save(Account account){
        accountDao.save(account);
    }
}
