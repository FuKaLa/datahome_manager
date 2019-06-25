package com.huatec.datahome.controller;

import com.huatec.datahome.domain.HuatecStudent;
import com.huatec.datahome.domain.LoginRecord;
import com.huatec.datahome.domain.MajorOprationDO;
import com.huatec.datahome.domain.SmartLearningStuDO;
import com.huatec.datahome.service.SmartLearningStuService;
import com.huatec.datahome.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 智慧学习学生
 * @author dingjiatian
 * @date 2019-06-21
 */

@Controller
//@RequestMapping("/smartLearningStu")
public class SmartLearningStuController {
    private final SmartLearningStuService smartLearningStuService;

    @Autowired
    SmartLearningStuController(SmartLearningStuService smartLearningStuService){
        this.smartLearningStuService = smartLearningStuService;
    }

    @RequestMapping("/updateSmartLearningStu")
    @ResponseBody
    public R update(@RequestBody SmartLearningStuDO smartLearningStuDO) {
        /**
         * 智慧学习基础
         */
         int baseInfo = smartLearningStuService.updateBaseInfo(smartLearningStuDO.getBaseInfo());

        /**
         * 接入方式占比
         */

        int loginNum = smartLearningStuService.updateLoginNum(smartLearningStuDO.getLoginNum());

        return R.ok();
    }

    @RequestMapping("/getDetailSmartLearningStu")
    public String getByMajor(Model model) {

        List<HuatecStudent> baseInfo = smartLearningStuService.getBaseInfo();

        List<LoginRecord> loginNum = smartLearningStuService.getLoginNum();
        model.addAttribute("baseInfo",baseInfo);
        model.addAttribute("loginNum",loginNum);
        return "zhihuistu";
    }


}
