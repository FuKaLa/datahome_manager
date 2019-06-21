package com.huatec.datahome.domain;


/**
 * Created by Administrator on 2019/6/21.
 * 毕业生就业结构
 */
public class EmploymentStructure {
    private String structure;

    private Integer employment;

    private String majorName;

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public Integer getEmployment() {
        return employment;
    }

    public void setEmployment(Integer employment) {
        this.employment = employment;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }
}
