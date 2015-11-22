package com.hackgirlszju.service.impl;

import com.hackgirlszju.dao.TaskMapper;
import com.hackgirlszju.model.Task;
import com.hackgirlszju.model.User;
import com.hackgirlszju.model.UserKey;
import com.hackgirlszju.service.TaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sibylla on 15/11/21.
 */

@Service("TaskService")
public class TaskServiceImpl implements TaskService {

    @Resource
    private TaskMapper taskMapper;

    public int insert(Task task) {

        return taskMapper.insert(task);

    }

    public List<Task> list() {

        return taskMapper.list();

    }

    public int updateStatusById(Integer taskId,Integer status) {

        Task task = taskMapper.selectByPrimaryKey(taskId);

        task.setStatus(status);

        return taskMapper.updateByPrimaryKey(task);
    }

    public Task selectById(Integer taskId) {

        return taskMapper.selectByPrimaryKey(taskId);
    }

    public int updateReceiverByTaskId(Integer taskId,UserKey userKey) {

        Task task = taskMapper.selectByPrimaryKey(taskId);

        task.setReceiverId(userKey.getId());

        task.setReceiverName(userKey.getName());

        return taskMapper.updateByPrimaryKey(task);
    }
}
