package com.huatec.datahome.domain;

/**
 * Created by Administrator on 2019/6/23.
 */
public class LoginRecord {

    private String loginType;

    private Integer loginNum;

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public Integer getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }
}