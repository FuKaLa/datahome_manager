package com.huatec.datahome.controller;

import com.huatec.datahome.domain.MajorAnalysisDO;
import com.huatec.datahome.domain.MajorBasic;
import com.huatec.datahome.domain.MajorEmployment;
import com.huatec.datahome.service.MajorAnalysisService;
import com.huatec.datahome.utils.R;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.util.List;

/**
 * 专业分析
 * controller层
 * @author dingjiatian
 * @date 2019-06-21
 */
@Controller
//@RequestMapping("/MajorAnalysis")
public class MajorAnalysisController {

    private MajorAnalysisService majorAnalysisService;

    @Autowired
    public MajorAnalysisController(MajorAnalysisService majorAnalysisService){
        this.majorAnalysisService = majorAnalysisService;

    }

    @RequestMapping("/updateMajorAnalysis")
    @ResponseBody
    public R update(@RequestBody MajorAnalysisDO majorAnalysisDO) {

        //修改基本信息
        int majorBasic = majorAnalysisService.updateMajorBasic(majorAnalysisDO.getMajorBasic());

        //就业岗位数量分布
        List<MajorEmployment> num = majorAnalysisDO.getEmploymentNum();
        if(num == null || num.size() == 0 ){
            return R.ok();
        }
        int majorEmployment = majorAnalysisService.updateMajorEmployment(majorAnalysisDO.getEmploymentNum());

        return R.ok();
    }

    @RequestMapping("/getByMajorMajorAnalysis")
    public String getByMajor(Model model, String majorName) {
        //获取基本信息
        List<MajorBasic> majorBasic = majorAnalysisService.getMajorBasic(majorName);
        //就业岗位数量分布
        List<MajorEmployment> majorEmployment = majorAnalysisService.getMajorEmployment(majorName);
        model.addAttribute("majorBasic",majorBasic);
        model.addAttribute("majorEmployment",majorEmployment);
        model.addAttribute("majorName",majorName);
        return "zhuanyefenxi";
    }

}
