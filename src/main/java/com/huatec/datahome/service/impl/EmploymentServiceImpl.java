package com.huatec.datahome.service.impl;

import com.huatec.datahome.dao.EmploymentDao;
import com.huatec.datahome.domain.EmploymentDO;
import com.huatec.datahome.domain.EmploymentStructure;
import com.huatec.datahome.domain.GraduateAbility;
import com.huatec.datahome.domain.GraduateSalary;
import com.huatec.datahome.service.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dingjiatian on 2019/6/21.
 * 就业分析
 */
@Service
public class EmploymentServiceImpl implements EmploymentService {

    @Autowired
    private EmploymentDao employmentDao;

    //修改累计毕业生数量
    @Override
    public int updateGraduateNum(EmploymentDO employmentDO) {
        return employmentDao.updateGraduateNum(employmentDO);
    }

    //毕业生能力分析
    @Override
    public int updateGraduateAbility(List<GraduateAbility> graduateAbilities) {
        return employmentDao.updateGraduateAbility(graduateAbilities);
    }

    //毕业生就业结构
    @Override
    public int updateEmploymentStructure(List<EmploymentStructure> employmentStructures) {
        return employmentDao.updateEmploymentStructure(employmentStructures);
    }

    //毕业生平均薪资跟踪
    @Override
    public int updateGraduateSalary(List<GraduateSalary> graduateSalarie) {
        return employmentDao.updateGraduateSalary(graduateSalarie);
    }


    @Override
    public EmploymentDO getGraduateNum(String majorName) {
        return employmentDao.getGraduateNum( majorName);
    }

    @Override
    public List<GraduateAbility> getGraduateAbility(String majorName) {
        return employmentDao.getGraduateAbility( majorName);
    }

    @Override
    public List<EmploymentStructure> getEmploymentStructure(String majorName) {
        return employmentDao.getEmploymentStructure( majorName);
    }

    @Override
    public List<GraduateSalary> getGraduateSalary(String majorName) {
        return employmentDao.getGraduateSalary( majorName);
    }


}
