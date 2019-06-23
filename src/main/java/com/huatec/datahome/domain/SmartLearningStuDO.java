package com.huatec.datahome.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dingjiatian on 2019/6/21.
 */
public class SmartLearningStuDO implements Serializable {

    /**
     * 智慧学习基础
     */
    private List<HuatecStudent> baseInfo;

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
    private List<LoginRecord> loginNum;

    /**
     * 项目部学习热度top5
     * 不维护
     */

    /**
     * 今天在线学生小时数量
     * 不维护
     */
    public List<HuatecStudent> getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(List<HuatecStudent> baseInfo) {
        this.baseInfo = baseInfo;
    }

    public List<LoginRecord> getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(List<LoginRecord> loginNum) {
        this.loginNum = loginNum;
    }
}
