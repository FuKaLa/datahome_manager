package com.huatec.datahome.domain;

/**
 * Created by Administrator on 2019/6/21.
 */
public class GraduateSalary {

    private Integer graduationDuration;

    private String majorName;
    //北京
    private Integer averageSalary;

    private Integer graduateSalary;

    public Integer getGraduationDuration() {
        return graduationDuration;
    }

    public void setGraduationDuration(Integer graduationDuration) {
        this.graduationDuration = graduationDuration;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Integer getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(Integer averageSalary) {
        this.averageSalary = averageSalary;
    }

    public Integer getGraduateSalary() {
        return graduateSalary;
    }

    public void setGraduateSalary(Integer graduateSalary) {
        this.graduateSalary = graduateSalary;
    }
}
