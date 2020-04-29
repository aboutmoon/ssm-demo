package com.demo.controller;

import com.demo.pojo.Account;
import com.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    /**
     * find all
     * @return
     */
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() {

        List<Account> list = accountService.findAll();

        for (Account account: list){
            System.out.println(account);
        }

        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        System.out.println("表现层：查询所有的帐号。。。");
        return mv;
    }

    @RequestMapping("save.do")
    public String save(Account account) {
        accountService.insert(account);
        return "success";
    }
}
