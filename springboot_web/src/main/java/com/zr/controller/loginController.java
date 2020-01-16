package com.zr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class loginController {


    @RequestMapping({"/hello"})
    @ResponseBody
    public String hello(){
        return "hello";
    }


    @RequestMapping("/login")
    public String login(String username, String password, Map<String,Object> map,HttpSession session){
        if (StringUtils.isEmpty(username) && "123456".equals(password)){
            session.setAttribute("user",username);
            return "redirect:index";
        }else {
            map.put("msg","用户密码错误");
            return "login";
        }

    }
    @RequestMapping({"/", "/index.html"})
    public String index(){
        return "index";
    }


}
