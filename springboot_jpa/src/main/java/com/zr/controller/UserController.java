package com.zr.controller;

import com.zr.entity.User;
import com.zr.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping("select")
    public List<User> selectAll(){

        return repository.findAll();
    }
    @GetMapping("select/{id}")
    public User selectById(@PathVariable("id")String id){

        return repository.getOne(id);
    }


    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable("id")String id){

        repository.deleteById(id);

        return "删除成功";
    }
    @PostMapping("add")
    public String addAll(@RequestBody List<User> users){

        repository.saveAll(users);

        return "添加成功";
    }

}
