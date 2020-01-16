package com.zr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class RedisController {

    /**
     * 了获取每一个请求到底是哪一个 Spring Boot 提供的服务，
     * 需要在每次请求时返回当前服务的端口号，因此这里我注入了 server.port 。
     */
    @Value("${server.port}")
    Integer port;

    @GetMapping("/set")
    public String set(HttpSession session) {
        session.setAttribute("user", "javaboy");
        return String.valueOf(port);
    }

    @GetMapping("/get")
    public String get(HttpSession session) {
        return session.getAttribute("user") + ":" + port;
    }
}
