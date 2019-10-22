package com.longge;

import com.longge.dao.UserDao;
import com.longge.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author longge
 * @create 2019-10-22 下午1:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootHelloworld2Application.class)
//@EnableAutoConfiguration
public class MybatisTest {
    @Autowired
    private UserDao dao;

    @Test
    public void test(){
        List<User> users = dao.findAll();
        users.stream().forEach(System.out::println);
    }

}
