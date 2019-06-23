package com.huatec.datahome.domain;

/**
 * Created by Administrator on 2019/6/23.
 */
public class RequiredBoutiqueCourse {

    private String courseCategory;
    private Integer courseNum;

    public String getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(String courseCategory) {
        this.courseCategory = courseCategory;
    }

    public Integer getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
    }
}
