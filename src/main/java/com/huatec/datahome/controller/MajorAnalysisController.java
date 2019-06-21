package com.huatec.datahome.controller;

import com.huatec.datahome.service.MajorAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 专业分析
 * controller层
 *
 * @author dingjiatian
 * @date 2019-06-21
 */
@Controller
@RequestMapping("majorAnalysis")
public class MajorAnalysisController {

    private MajorAnalysisService majorAnalysisService;

    @Autowired
    public MajorAnalysisController(MajorAnalysisService majorAnalysisService){
        this.majorAnalysisService = majorAnalysisService;

    }

}
