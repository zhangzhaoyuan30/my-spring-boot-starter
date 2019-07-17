package com.zzy.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @auther: zhangzhaoyuan
 * @date: 2019/07/17
 * @description:
 */
@ConfigurationProperties(prefix = "zzy.greet")
public class GreeterProperties {
    private String userName;
    private String morningMsg;
    private String afternoonMsg;
    private String eveningMsg;
    private String nightMsg;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMorningMsg() {
        return morningMsg;
    }

    public void setMorningMsg(String morningMsg) {
        this.morningMsg = morningMsg;
    }


    public String getEveningMsg() {
        return eveningMsg;
    }

    public void setEveningMsg(String eveningMsg) {
        this.eveningMsg = eveningMsg;
    }

    public String getNightMsg() {
        return nightMsg;
    }

    public void setNightMsg(String nightMsg) {
        this.nightMsg = nightMsg;
    }

    public String getAfternoonMsg() {
        return afternoonMsg;
    }

    public void setAfternoonMsg(String afternoonMsg) {
        this.afternoonMsg = afternoonMsg;
    }
}