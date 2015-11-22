package com.hackgirlszju.service.impl;

import com.hackgirlszju.dao.UserMapper;
import com.hackgirlszju.model.User;
import com.hackgirlszju.model.UserKey;
import com.hackgirlszju.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sibylla on 15/11/21.
 */
@Service("UserService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    public User selectByName(String name) {

        return userMapper.selectByName(name);
    }

    public int insert(User user) {

        return userMapper.insert(user);
    }

//    public User selectById(Integer id) {
//
//
//    }


}
