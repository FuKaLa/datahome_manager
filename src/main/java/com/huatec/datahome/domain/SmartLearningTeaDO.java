package com.huatec.datahome.domain;


import java.util.List;

/**
 * Created by dingjiatian on 2019/6/21.
 */
public class SmartLearningTeaDO {

    /**
     * 智慧学习基础
     */
    private List<Common1> baseInfo;
    /**
     * 最近30天教师登陆人次
     * 不用维护
     */

    /**
     * 精品必修
     */
    private List<Common1> jpbxNum;

    /**
     * 课程信息
     *
     */
    private List<Common1> courseNum;
    /**
     * 数字化资源占比
     *
     */
    private List<Common1> digitizationNum;
    /**
     * 最近30天新建课程数量
     * 不维护
     */

    /**
     * 今天在线教师小时数量
     * 不维护
     */

    public List<Common1> getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(List<Common1> baseInfo) {
        this.baseInfo = baseInfo;
    }

    public List<Common1> getJpbxNum() {
        return jpbxNum;
    }

    public void setJpbxNum(List<Common1> jpbxNum) {
        this.jpbxNum = jpbxNum;
    }

    public List<Common1> getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(List<Common1> courseNum) {
        this.courseNum = courseNum;
    }

    public List<Common1> getDigitizationNum() {
        return digitizationNum;
    }

    public void setDigitizationNum(List<Common1> digitizationNum) {
        this.digitizationNum = digitizationNum;
    }
}
