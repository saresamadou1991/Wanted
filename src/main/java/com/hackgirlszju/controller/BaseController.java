package com.hackgirlszju.controller;

import com.hackgirlszju.util.Util;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by sibylla on 15/11/21.
 */

public class BaseController {

    protected Map succ(Object resultData) {
        return Util.buildMap("status", 200, "msg", "", "data", resultData);
    }

    protected Map fail(String errMsg) {
        return Util.buildMap("status", 500, "msg", errMsg);
    }

//    protected Map succList(List<T> listData) {
//        return succ(Util.buildMap("list",listData));
//    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

}
