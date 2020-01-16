package com.zr.service.impl;

import com.zr.mapper.UserMapper;
import com.zr.pojo.User;
import com.zr.service.UserService;
import com.zr.tools.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService  {


    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> findAll() {
        return mapper.selectAll();
    }





}
