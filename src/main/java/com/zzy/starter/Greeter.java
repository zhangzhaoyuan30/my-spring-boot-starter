package com.zzy.starter;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;

/**
 * @auther: zhangzhaoyuan
 * @date: 2019/07/17
 * @description:
 */
public class Greeter {

    @Autowired
    private GreeterProperties greeterProperties;

    private String sayMorning() {
        return greeterProperties.getMorningMsg();
    }

    private String sayAfternoon() {
        return greeterProperties.getAfternoonMsg();
    }

    private String sayEvening() {
        return greeterProperties.getEveningMsg();
    }


    /**
     * 外部调用方法
     * @return
     */
    public String sayHello() {
        String msg;
        int h = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (h < 8) {
            msg = sayMorning();
        } else if (h >= 12 && h <= 16) {
            msg = sayAfternoon();
        } else {
            msg = sayEvening();
        }

        return "[" + greeterProperties.getUserName() + "] " + msg;
    }
}