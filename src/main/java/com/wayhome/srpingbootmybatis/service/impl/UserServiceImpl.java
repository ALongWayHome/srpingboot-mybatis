package com.wayhome.srpingbootmybatis.service.impl;

import com.wayhome.srpingbootmybatis.entity.User;
import com.wayhome.srpingbootmybatis.mapper.UserMapper;
import com.wayhome.srpingbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    @Override
    public boolean editUser(User user) {
        return userMapper.editUser(user);
    }
}
