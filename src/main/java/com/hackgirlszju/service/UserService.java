package com.hackgirlszju.service;

import com.hackgirlszju.model.User;
import com.hackgirlszju.model.UserKey;

/**
 * Created by sibylla on 15/11/21.
 */
public interface UserService {

//    public User getUserInfo();

    public User selectByName(String name);

    public int insert(User user);

//    public User selectById(Integer id);

}
