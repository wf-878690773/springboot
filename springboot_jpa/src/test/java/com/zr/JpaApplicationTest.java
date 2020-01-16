package com.zr;

import com.zr.entity.User;
import com.zr.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest(classes = SpringbootJpaApplication.class )
public class JpaApplicationTest {

    @Autowired
    UserRepository userRepository;
    @Test
    public void testuser() {
        //添加测试数据
        List<User> users = userRepository.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        //开始进行测试

    }
}