package com.zr;

import com.zr.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zr.mapper")
public class SpringbootMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMapperApplication.class, args);
    }

}
