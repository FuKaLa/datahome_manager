package com.huatec.datahome.domain;

import java.util.List;

/**
 * Created by Administrator on 2019/6/21.
 */
public class EmploymentDO {
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
}
