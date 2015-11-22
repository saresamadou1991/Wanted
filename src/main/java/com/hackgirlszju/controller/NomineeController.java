package com.hackgirlszju.controller;

import com.hackgirlszju.model.Nominee;
import com.hackgirlszju.service.NomineeService;
import com.hackgirlszju.util.Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by sibylla on 15/11/22.
 */

@Controller
@RequestMapping("/nominee")
public class NomineeController extends BaseController {

    @Resource
    private NomineeService nomineeService;


    @RequestMapping("/add")
    @ResponseBody
    public Map addNominee(Nominee nominee) { //领任务成为任务候选人

        if(nominee.getTaskId() == null || nominee.getTaskId() < 1) {

            return fail("任务ID为空");
        }

        if(nominee.getNomineeId() == null || nominee.getNomineeId() < 1) {

            return fail("任务ID为空");
        }

        nomineeService.insertByTaskId(nominee);

        return succ(null);
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map listNominee(Integer taskId) {

        if(taskId == null || taskId < 1) {

            return fail("任务ID为空");
        }

        List<Nominee> list = nomineeService.listByTaskId(taskId);

        return succ(Util.buildMap("list",list));

    }


//    public Map clearNomineeByTaskId(Integer taskId) {
//
//        if(taskId == null || taskId < 1) {
//
//            return fail("任务ID为空");
//        }
//
//        nomineeService.deleteAllByTaskId(taskId);
//
//        return succ(null);
//    }

}
