package com.huatec.datahome.domain;


import java.io.Serializable;
import java.util.List;

/**
 * Created by dingjiatian on 2019/6/21.
 */
public class SmartLearningTeaDO implements Serializable {

    /**
     * 智慧学习基础
     */
    private List<HuatecTeacher> baseInfo;
    /**
     * 最近30天教师登陆人次
     * 不用维护
     */

    /**
     * 精品必修
     */
    private List<RequiredBoutiqueCourse> jpbxNum;

    /**
     * 课程信息
     *
     */
    private List<MajorBasic> courseNum;
    /**
     * 数字化资源占比
     *
     */
    private List<CourseResources> digitizationNum;
    /**
     * 最近30天新建课程数量
     * 不维护
     */

    /**
     * 今天在线教师小时数量
     * 不维护
     */

    public List<HuatecTeacher> getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(List<HuatecTeacher> baseInfo) {
        this.baseInfo = baseInfo;
    }

    public List<RequiredBoutiqueCourse> getJpbxNum() {
        return jpbxNum;
    }

    public void setJpbxNum(List<RequiredBoutiqueCourse> jpbxNum) {
        this.jpbxNum = jpbxNum;
    }

    public List<MajorBasic> getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(List<MajorBasic> courseNum) {
        this.courseNum = courseNum;
    }

    public List<CourseResources> getDigitizationNum() {
        return digitizationNum;
    }

    public void setDigitizationNum(List<CourseResources> digitizationNum) {
        this.digitizationNum = digitizationNum;
    }
}
