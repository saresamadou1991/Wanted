package com.hackgirlszju.dao;

import com.hackgirlszju.model.Task;
import com.hackgirlszju.model.TaskExample;
import java.util.List;

import com.hackgirlszju.model.UserKey;
import org.apache.ibatis.annotations.Param;

public interface TaskMapper {

    List<Task> list();

    int insert(Task record);


    Task selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKey(Task task);

}