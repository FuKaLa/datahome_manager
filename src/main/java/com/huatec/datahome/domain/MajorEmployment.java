package com.huatec.datahome.domain;

/**
 * Created by dingajiatian on 2019/6/23.
 */
public class MajorEmployment {

    private String majorName;

    private String employmentJob;

    private Integer employmentNum;

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getEmploymentJob() {
        return employmentJob;
    }

    public void setEmploymentJob(String employmentJob) {
        this.employmentJob = employmentJob;
    }

    public Integer getEmploymentNum() {
        return employmentNum;
    }

    public void setEmploymentNum(Integer employmentNum) {
        this.employmentNum = employmentNum;
    }
}
