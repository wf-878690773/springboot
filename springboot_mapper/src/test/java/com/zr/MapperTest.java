package com.zr;

import com.zr.mapper.UserMapper;
import com.zr.pojo.User;
import com.zr.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {

    @Autowired
    private UserService userService;
    @Test
    public void findAll(){

        List<User> userList = userService.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
