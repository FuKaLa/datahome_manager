package com.huatec.datahome.controller;

import com.huatec.datahome.domain.EmploymentDO;
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

        return R.ok();
    }



}
