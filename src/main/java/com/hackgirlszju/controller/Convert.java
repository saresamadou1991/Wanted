package com.hackgirlszju.controller;

import com.alibaba.druid.filter.config.ConfigTools;

/**
 * Created by sibylla on 15/11/21.
 */
public class Convert {

    public static void main(String[] args) {
        try {
            System.out.println(ConfigTools.decrypt("hf96/2MU+Q12fdb9oZN9ghub1OHmUBa8YuW7NJf8Pll/sawcaRVscHTpr4t5SB39+KbJn31Lqy76uEDvj+sgMw=="));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
