package com.huatec.datahome.dao;

import com.huatec.datahome.domain.EmploymentDO;
import com.huatec.datahome.domain.EmploymentStructure;
import com.huatec.datahome.domain.GraduateAbility;
import com.huatec.datahome.domain.GraduateSalary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dingjiatian on 2019/6/21.
 * 就业分析
 */
@Repository
@Mapper
public interface EmploymentDao {

    //修改累计毕业生数量
    int updateGraduateNum(EmploymentDO employmentDO);

    //毕业生能力分析
    int updateGraduateAbility(@Param("graduateAbilities") List<GraduateAbility> graduateAbilities);

    //毕业生就业结构
    int updateEmploymentStructure(@Param("employmentStructures") List<EmploymentStructure> employmentStructures);

    //毕业生平均薪资跟踪
    int updateGraduateSalary(@Param("graduateSalarie") List<GraduateSalary> graduateSalarie);


    //累计毕业生数量
    EmploymentDO getGraduateNum(@Param("majorName") String majorName);

    //毕业生能力分析
    List<GraduateAbility> getGraduateAbility(@Param("majorName") String majorName);

    //毕业生就业结构
    List<EmploymentStructure> getEmploymentStructure(@Param("majorName") String majorName);

    //毕业生平均薪资跟踪
    List<GraduateSalary> getGraduateSalary(@Param("majorName") String majorName);


}
