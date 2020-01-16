package com.zr.config;

import com.zr.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 自定义，默认访问首页
 */
/*@Configuration  //定义该类是个mvc配置类*/
public class MyMvcConfig implements WebMvcConfigurer {

    /**
     * //添加视图控制器
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {


        registry.addViewController("/").setViewName("login");
        registry.addViewController("index.html").setViewName("login");
    }

    /**
     * 注册拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         *          静态资源； *.css , *.js
         *         SpringBoot已经做好了静态资源映射
         *
         *         忽略index.html 和 /user/login
         */
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html","/","/user/login","/asserts/**","/webjars/**");
    }
}
