package com.train.service.impl;

import com.train.dao.mapper.UserMapper;
import com.train.manager.model.User;
import com.train.service.IUserManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagement implements IUserManagement {

    @Autowired
    UserMapper userMapper;

    @Override
    public User queryUserInfo() {
        User user = userMapper.queryUserInfo();
        return user;
    }
}
