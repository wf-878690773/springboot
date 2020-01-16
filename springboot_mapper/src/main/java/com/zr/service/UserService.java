package com.zr.service;

import com.zr.pojo.User;
import com.zr.tools.BaseService;

import java.util.List;

public interface UserService extends BaseService<User> {

    List<User> findAll();
}
