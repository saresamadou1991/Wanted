package com.hackgirlszju.controller;

import com.alibaba.druid.filter.config.ConfigTools;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sibylla on 15/11/21.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getName")
    public String getName(ModelMap modelMap){
        modelMap.put("name","banana");
        return "userName";
    }

    public void convert() {
        try {
            ConfigTools.decrypt("hf96/2MU+Q12fdb9oZN9ghub1OHmUBa8YuW7NJf8Pll/sawcaRVscHTpr4t5SB39+KbJn31Lqy76uEDvj+sgMw==");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
