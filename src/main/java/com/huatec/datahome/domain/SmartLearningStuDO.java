package com.huatec.datahome.domain;

import java.util.List;

/**
 * Created by dingjiatian on 2019/6/21.
 */
public class SmartLearningStuDO {

    /**
     * 智慧学习基础
     */
    private List<Common1> baseInfo;

    /**
     * 最近30天各专业学习人数占比
     * 不维护
     */

    /**
     * 24小时平均在线情况
     * 不维护
     */

    /**
     * 最近30天学习行为记录
     * 不维护
     */

    /**
     * 接入方式占比
     */
    private List<Common1> loginNum;

    /**
     * 项目部学习热度top5
     * 不维护
     */

    /**
     * 今天在线学生小时数量
     * 不维护
     */
    public List<Common1> getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(List<Common1> baseInfo) {
        this.baseInfo = baseInfo;
    }

    public List<Common1> getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(List<Common1> loginNum) {
        this.loginNum = loginNum;
    }
}
