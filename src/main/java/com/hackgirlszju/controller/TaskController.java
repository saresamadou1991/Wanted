package com.hackgirlszju.controller;

import com.hackgirlszju.model.Task;
import com.hackgirlszju.model.User;
import com.hackgirlszju.model.UserKey;
import com.hackgirlszju.service.NomineeService;
import com.hackgirlszju.service.TaskService;
import com.hackgirlszju.util.Constants;
import com.hackgirlszju.util.Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by sibylla on 15/11/21.
 */

@Controller
@RequestMapping("/task")
public class TaskController extends BaseController {


    @Resource
    private TaskService taskService;

    @Resource
    private NomineeService nomineeService;

    @RequestMapping("index")
    public String indexPage() {
        return "index";
    }

    //返回任务列表
    @RequestMapping("list")
    @ResponseBody
    public Map list() {

        List<Task> taskList = taskService.list();

        if(taskList==null || taskList.size() == 0) {
            return fail("暂无任务");
        }

        for(Task task:taskList) {
            if(task.getReceiverId() == null) {

                if(Util.beforeNow(task.getValidtime())) {

                    taskService.updateStatusById(task.getId(), Constants.TASK_INVALID);
                }

            }
//            else {
//
//                if(Util.beforeNow(task.getValidtime())) {
//
//                    if(task.getStatus() == Constants.TASK_RECEIVED)
//                    taskService.updateStatusById(task.getId(),Constants.TASK_FAILED);
//                }
//
//            }
        }

        return succ(taskList);

    }

    //发布任务

    @RequestMapping("release")
    @ResponseBody
    public Map createTask(Task task) {

        String errMsg = validateTask(task);
        if(errMsg!=null)
            return fail(errMsg);

        taskService.insert(task);

        return succ(null);
    }

    private String validateTask(Task task) {

        if(task.getId()==null || task.getId() < 1) {
            return "任务ID为空！";
        }
        else if(task.getSeekerId() == null || task.getSeekerId() < 1) {
            return "发布者ID为空！";
        }
        else if(task.getSeekerName() == null) {
            return "发布者名为空！";
        }
        else if(task.getTitle() == null) {
            return "任务标题为空！";
        }
        else if(task.getRequirement() == null) {
            return "任务要求为空！";
        }

        return null;
    }
    //确定任务执行者
    @RequestMapping("setReceiver")
    @ResponseBody
    public Map confirmReceiver(Integer taskId,Integer nomineeId, String nomineeName) {


        if(taskId == null || taskId < 1)
            return fail("任务ID为空");

        if(nomineeId == null || nomineeId < 1)
            return fail("候选人ID为空");

        Task task = taskService.selectById(taskId);

        if(task==null)
            return fail("任务不存在");

        taskService.updateReceiverByTaskId(taskId,new UserKey(nomineeId, nomineeName));

        taskService.updateStatusById(taskId, Constants.TASK_RECEIVED);

        nomineeService.deleteAllByTaskId(taskId);

        return succ(null);

    }


    //确认任务，0 完成 1 失败。
    @RequestMapping("confirm")
    @ResponseBody
    public Map confirmTask(Integer taskId,Integer status) {

        if(taskId == null || taskId < 1)
            return fail("任务ID为空");

        if(status == Constants.TASK_COMPLETED || status == Constants.TASK_FAILED)
            taskService.updateStatusById(taskId, status);

        else return fail("任务状态格式不符");

        return succ(null);
    }



}
