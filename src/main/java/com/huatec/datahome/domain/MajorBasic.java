package com.huatec.datahome.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

/**
 * Created by Administrator on 2019/6/21.
 */
public class MajorBasic {
    private String majorName;

    private Integer majorBook;

    private Integer majorTeacher;

    private Integer majorCourse;

    private Integer majorCourseHour;

    private Double majorSatisfaction;

    private Integer undergraduate;

    private Integer vocational;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date setupTime;
    private String setupDate;

    private Integer majorStudent;

    public String getSetupDate() {
        return setupDate;
    }

    public void setSetupDate(String setupDate) {
        this.setupDate = setupDate;
    }

    public Integer getMajorStudent() {
        return majorStudent;
    }

    public void setMajorStudent(Integer majorStudent) {
        this.majorStudent = majorStudent;
    }

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

    public Double getMajorSatisfaction() {
        return majorSatisfaction;
    }

    public void setMajorSatisfaction(Double majorSatisfaction) {
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
