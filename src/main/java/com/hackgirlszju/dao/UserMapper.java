package com.hackgirlszju.dao;

import com.hackgirlszju.model.User;
import com.hackgirlszju.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectByName(@Param("name")String name);

    int insert(User record);
}