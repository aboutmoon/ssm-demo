package com.demo.test;

import com.demo.dao.IAccountDao;
import com.demo.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void run1() throws IOException {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建session
        SqlSession session = factory.openSession();
        //获取代理对象
        IAccountDao mapper = session.getMapper(IAccountDao.class);
        //调用方法
        List<Account> list = mapper.findAll();
        for (Account account: list){
            System.out.println(account);
        }
        //关闭资源
        session.close();
        inputStream.close();



    }
}
