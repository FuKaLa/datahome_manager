package com.huatec.datahome.controller;

import com.huatec.datahome.domain.EmploymentDO;
import com.huatec.datahome.domain.EmploymentStructure;
import com.huatec.datahome.domain.GraduateAbility;
import com.huatec.datahome.domain.GraduateSalary;
import com.huatec.datahome.service.EmploymentService;
import com.huatec.datahome.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 就业分析
 * controller层
 * @author dingjiatian
 * @date 2019-06-21
 */
@Controller
@RequestMapping("/employment")
public class EmploymentController {

    @Autowired
    private EmploymentService employmentService;

    @RequestMapping("/update")
    @ResponseBody
    public R update(@RequestBody EmploymentDO employmentDO) {

        //修改累计毕业生数量
        int updateGraduateNum = employmentService.updateGraduateNum(employmentDO);

        //毕业生能力分析
        int updateGraduateAbility = employmentService.updateGraduateAbility(employmentDO.getGraduateAbilitie());

        //毕业生就业结构
        int updateEmploymentStructure = employmentService.updateEmploymentStructure(employmentDO.getEmployStructure());

        //毕业生平均薪资跟踪
        int updateGraduateSalary = employmentService.updateGraduateSalary(employmentDO.getGraduateSalarie());

        return R.ok();
    }

    @RequestMapping("/getByMajor")
    @ResponseBody
    public R getByMajor(String majorName) {
        //累计毕业生数量
        EmploymentDO employmentDO = employmentService.getGraduateNum(majorName);

        //毕业生能力分析
        List<GraduateAbility> graduateAbility = employmentService.getGraduateAbility(majorName);

        //毕业生就业结构
        List<EmploymentStructure> employmentStructure = employmentService.getEmploymentStructure(majorName);

        //毕业生平均薪资跟踪
        List<GraduateSalary> graduateSalaries = employmentService.getGraduateSalary(majorName);

        employmentDO.setEmployStructure(employmentStructure);
        employmentDO.setGraduateAbilitie(graduateAbility);
        employmentDO.setGraduateSalarie(graduateSalaries);
        return R.resultData(employmentDO);
    }


}
