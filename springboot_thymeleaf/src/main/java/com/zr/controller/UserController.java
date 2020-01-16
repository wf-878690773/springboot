package com.zr.controller;

import com.zr.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class UserController {


    private List<User> userList = new ArrayList<>();

    {
        userList.add(new User("1", "socks", "123456", new Date()));
        userList.add(new User("2", "admin", "111111", new Date()));
        userList.add(new User("3", "jacks", "222222", null));
    }



    @GetMapping("/user/{userId}")
    public ModelAndView userForm(@PathVariable String userId) {
        return new ModelAndView("user/userForm", "user", userList.get(0));
    }



    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello.thymeleaf";
    }

    @RequestMapping("/")
    public String login() {
        return "/user/login";
    }

    @RequestMapping("/register")
    public String register() {
        return "/user/register";
    }







}
