package com.huatec.datahome.domain;

import java.util.Date;

/**
 * Created by Administrator on 2019/6/21.
 */
public class MajorBasic {
    private String majorName;

    private Integer majorBook;

    private Integer majorTeacher;

    private Integer majorCourse;

    private Integer majorCourseHour;

    private Integer majorSatisfaction;

    private Integer undergraduate;

    private Integer vocational;

    private Date setupTime;

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Integer getMajorBook() {
        return majorBook;
    }

    public void setMajorBook(Integer majorBook) {
        this.majorBook = majorBook;
    }

    public Integer getMajorTeacher() {
        return majorTeacher;
    }

    public void setMajorTeacher(Integer majorTeacher) {
        this.majorTeacher = majorTeacher;
    }

    public Integer getMajorCourse() {
        return majorCourse;
    }

    public void setMajorCourse(Integer majorCourse) {
        this.majorCourse = majorCourse;
    }

    public Integer getMajorCourseHour() {
        return majorCourseHour;
    }

    public void setMajorCourseHour(Integer majorCourseHour) {
        this.majorCourseHour = majorCourseHour;
    }

    public Integer getMajorSatisfaction() {
        return majorSatisfaction;
    }

    public void setMajorSatisfaction(Integer majorSatisfaction) {
        this.majorSatisfaction = majorSatisfaction;
    }

    public Integer getUndergraduate() {
        return undergraduate;
    }

    public void setUndergraduate(Integer undergraduate) {
        this.undergraduate = undergraduate;
    }

    public Integer getVocational() {
        return vocational;
    }

    public void setVocational(Integer vocational) {
        this.vocational = vocational;
    }

    public Date getSetupTime() {
        return setupTime;
    }

    public void setSetupTime(Date setupTime) {
        this.setupTime = setupTime;
    }
}
