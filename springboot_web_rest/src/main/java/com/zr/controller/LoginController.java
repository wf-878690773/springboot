package com.zr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 拦截器进行登陆检查
 */
@Controller
public class LoginController  {

    @PostMapping("/user/login")
    public String login(String username, String password, HttpSession session, Map<String,Object> map){

        if (!StringUtils.isEmpty(username) && "admin".equals(username) && "123456".equals(password)){

            session.setAttribute("LoginUser",username);
            return "redirect:dashboard.html";  ///登陆成功，防止表单重复提交，可以重定向到主页

        }else{

            map.put("msg","用户密码错误");
            return "login";
        }

    }

}
