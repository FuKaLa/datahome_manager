package com.huatec.datahome.controller;

import com.huatec.datahome.service.SmartLearningStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 专业运营
 * @author dingjiatian
 * @date 2019-06-21
 */

@Controller
@RequestMapping("smartLearningStu")
public class SmartLearningStuController {
    private final SmartLearningStuService smartLearningStuService;

    @Autowired
    SmartLearningStuController(SmartLearningStuService smartLearningStuService){
        this.smartLearningStuService = smartLearningStuService;
    }

}
