package com.hackgirlszju.controller;

import com.alibaba.fastjson.JSON;
import com.hackgirlszju.model.User;
import com.hackgirlszju.service.UserService;
import com.hackgirlszju.util.Util;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by sibylla on 15/11/21.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    @Resource
    private UserService userService;


    @RequestMapping("/login")
    @ResponseBody
    public Map login(String name) {
        User user = userService.selectByName(name);
        if(user==null) {
            return fail("用户名不存在！");
        }
        else {
            return succ(user);
        }

    }
    
//    @RequestMapping("/login")
//    public String getName(ModelMap modelMap){
//
//        modelMap.put("name", "banana");
//        return "userName";
//    }
//
//    @RequestMapping("/userInfo")
//    @ResponseBody
//    public Map userInfo() {
//        userService.getUserInfo();
//        User user = new User();
//        user.setId(1);
//        user.setProperty(100);
//        user.setRank(1);
//        user.setSchool("zju");
//        user.setSex(1);
//        user.setName("lzx");
//        user.setContact("18888888888");
//        return succ(user);
//    }
//
//    @RequestMapping("/saveInfo")
//    @ResponseBody
//    public Map saveInfo(User user) {
//        if(user==null)
//            return fail("用户信息为空");
//        else
//            System.out.println(user.getName());
//
//        return succ(null);
//    }
//
//    @RequestMapping("listInfo")
//    @ResponseBody
//    public Map listInfo() {
//
//        List<User> list = new ArrayList<User>();
//        User user = new User();
//        user.setId(1);
//        user.setProperty(100);
//        user.setRank(1);
//        user.setSchool("zju");
//        user.setSex(1);
//        user.setName("zkl");
//        user.setContact("18888883288");
//        User user2 = new User();
//        user2.setId(2);
//        user2.setProperty(50);
//        user2.setRank(2);
//        user2.setSchool("zju");
//        user2.setSex(1);
//        user2.setName("wyf");
//        user2.setContact("0000000000");
//        list.add(user);
//        list.add(user2);
//        return succ(Util.buildMap("list",list));
//    }
//
//    @RequestMapping("/saveList")
//    @ResponseBody
//    public Map saveList(String list) {
//        if(list==null) return fail("上传失败");
//        List<User> userList = JSON.parseArray(list,User.class);
//        if(userList==null||userList.size()==0)
//            return fail("列表为空");
//        return succ(null);
//    }


}
