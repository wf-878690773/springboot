package com.zr;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * http://localhost:8080/swagger-ui.html
 */

@SpringBootApplication
@MapperScan(basePackages = "com.zr.mapper")
public class SpringbootTxmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTxmybatisApplication.class, args);
    }

}
