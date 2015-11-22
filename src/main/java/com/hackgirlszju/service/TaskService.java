package com.hackgirlszju.service;

import com.hackgirlszju.model.Task;
import com.hackgirlszju.model.User;
import com.hackgirlszju.model.UserKey;

import java.util.List;

/**
 * Created by sibylla on 15/11/21.
 */
public interface TaskService {

    public List<Task> list();

    public int insert(Task task);

    public int updateStatusById(Integer taskId, Integer status); //更新任务状态

    public Task selectById(Integer taskId);

    public int updateReceiverByTaskId(Integer taskId,UserKey userKey);

}
