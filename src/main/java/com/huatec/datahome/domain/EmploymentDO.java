package com.huatec.datahome.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/6/21.
 */
public class EmploymentDO implements Serializable{
    //专业类型
    private String type;

    /**
     * 累计毕业生数量
     */
    //本科男
    private Integer undergraduateMale;
    //本科女
    private Integer undergraduateFemale;
    //高职男
    private Integer vocationalMale;
    //高职女
    private Integer vocationalFemale;

    /**
     * 历年就业率
     * 不维护
     */
    /**
     * 毕业生薪资与行业薪资走势
     * 不维护
     */
    /**
     * 毕业生能力分析
     */
    private List<GraduateAbility> graduateAbilitie;
    /**
     * 毕业生就业结构
     */
    private List<EmploymentStructure> employStructure;
    /**
     * 毕业生平均薪资跟踪
     */
    private List<GraduateSalary> graduateSalarie;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getUndergraduateMale() {
        return undergraduateMale;
    }

    public void setUndergraduateMale(Integer undergraduateMale) {
        this.undergraduateMale = undergraduateMale;
    }

    public Integer getUndergraduateFemale() {
        return undergraduateFemale;
    }

    public void setUndergraduateFemale(Integer undergraduateFemale) {
        this.undergraduateFemale = undergraduateFemale;
    }

    public Integer getVocationalMale() {
        return vocationalMale;
    }

    public void setVocationalMale(Integer vocationalMale) {
        this.vocationalMale = vocationalMale;
    }

    public Integer getVocationalFemale() {
        return vocationalFemale;
    }

    public void setVocationalFemale(Integer vocationalFemale) {
        this.vocationalFemale = vocationalFemale;
    }

    public List<GraduateAbility> getGraduateAbilitie() {
        return graduateAbilitie;
    }

    public void setGraduateAbilitie(List<GraduateAbility> graduateAbilitie) {
        this.graduateAbilitie = graduateAbilitie;
    }

    public List<EmploymentStructure> getEmployStructure() {
        return employStructure;
    }

    public void setEmployStructure(List<EmploymentStructure> employStructure) {
        this.employStructure = employStructure;
    }

    public List<GraduateSalary> getGraduateSalarie() {
        return graduateSalarie;
    }

    public void setGraduateSalarie(List<GraduateSalary> graduateSalarie) {
        this.graduateSalarie = graduateSalarie;
    }
}
