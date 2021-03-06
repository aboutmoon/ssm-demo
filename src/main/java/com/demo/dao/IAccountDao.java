package com.demo.dao;

import com.demo.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IAccountDao {

    @Select(value = "select * from account")
    public List<Account> findAll();

    @Insert("insert into account (name, money) values (#{name}, #{money})")
    void save(Account account);
}
