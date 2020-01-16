package com.zr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Session
 * 就是使用 Spring 中的代理过滤器，将所有的 Session 操作拦截下来，
 * 自动的将数据 同步到 Redis 中，或者自动的从 Redis 中读取数据。
 */
@SpringBootApplication
public class SpringbootSessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSessionApplication.class, args);
    }

}
