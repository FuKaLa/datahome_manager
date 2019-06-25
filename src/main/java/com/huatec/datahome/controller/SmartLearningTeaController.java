package com.huatec.datahome.controller;

import com.huatec.datahome.domain.*;
import com.huatec.datahome.service.SmartLearningTeaService;
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
 * 智慧学习老师
 * @author dingjiatian
 * @date 2019-06-21
 */

@Controller
//@RequestMapping("/smartLearningTea")
public class SmartLearningTeaController {
    private final SmartLearningTeaService smartLearningTeaService;

    @Autowired
    SmartLearningTeaController(SmartLearningTeaService smartLearningTeaService){
        this.smartLearningTeaService = smartLearningTeaService;
    }

    @RequestMapping("/updateSmartLearningTea")
    @ResponseBody
    public R update(@RequestBody SmartLearningTeaDO smartLearningTeaDO) {
        /**
         * 智慧学习基础
         */
         int baseInfo = smartLearningTeaService.updateBaseInfo(smartLearningTeaDO.getBaseInfo());
        /**
         * 精品必修
         */
         int jpbxNum = smartLearningTeaService.updateJpbxNum(smartLearningTeaDO.getJpbxNum());

        /**
         * 课程信息
         *
         */
         int courseNum = smartLearningTeaService.updateCourseNum(smartLearningTeaDO.getCourseNum());
        /**
         * 数字化资源占比
         *
         */
         int szhzyNum = smartLearningTeaService.UpdateSzhzyNum(smartLearningTeaDO.getDigitizationNum());
        return R.ok();
    }

    @RequestMapping("/getDetailSmartLearningTea")
    public String getByMajor(Model model) {
        /**
         * 智慧学习基础
         */
        List<HuatecTeacher> baseInfo = smartLearningTeaService.getBaseInfo();
        /**
         * 精品必修
         */
        List<RequiredBoutiqueCourse> jpbxNum = smartLearningTeaService.getJpbxNum();
        /**
         * 课程信息
         *
         */
        List<MajorBasic> courseNum = smartLearningTeaService.getCourseNum();
        /**
         * 数字化资源占比
         *
         */
        List<CourseResources> digitizationNum = smartLearningTeaService.getSzhzyNum();

        model.addAttribute("baseInfo", baseInfo);
        model.addAttribute("jpbxNum",jpbxNum);
        model.addAttribute("courseNum",courseNum);
        model.addAttribute("digitizationNum",digitizationNum);
        return "zhihuitea";
    }


}
