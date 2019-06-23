package com.huatec.datahome.service;

import com.huatec.datahome.domain.EmploymentDO;
import com.huatec.datahome.domain.EmploymentStructure;
import com.huatec.datahome.domain.GraduateAbility;
import com.huatec.datahome.domain.GraduateSalary;

import java.util.List;

/**
 * Created by dingjiatian on 2019/6/21.
 * 就业分析
 */
public interface EmploymentService {

    //修改累计毕业生数量
    int updateGraduateNum(EmploymentDO employmentDO);

    //毕业生能力分析
    int updateGraduateAbility(List<GraduateAbility> graduateAbilities);

    //毕业生就业结构
    int updateEmploymentStructure(List<EmploymentStructure> employmentStructures);

    //毕业生平均薪资跟踪
    int updateGraduateSalary(List<GraduateSalary> graduateSalarie);



    //累计毕业生数量
    EmploymentDO getGraduateNum(String majorName);

    //毕业生能力分析
    List<GraduateAbility> getGraduateAbility(String majorName);

    //毕业生就业结构
    List<EmploymentStructure> getEmploymentStructure(String majorName);

    //毕业生平均薪资跟踪
    List<GraduateSalary> getGraduateSalary(String majorName);

}
