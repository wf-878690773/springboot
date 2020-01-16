package com.zr;

import com.zr.mapper.UserMapper;
import com.zr.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test_db() {
        //开始进行测试
        List<User> users = userMapper.list();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
