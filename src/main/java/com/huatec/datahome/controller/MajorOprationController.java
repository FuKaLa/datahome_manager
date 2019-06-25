package com.huatec.datahome.controller;
import org.springframework.ui.Model;
import com.huatec.datahome.domain.*;
import com.huatec.datahome.service.MajorOprationService;
import com.huatec.datahome.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 专业运营
 * @author dingjiatian
 * @date 2019-06-21
 */

@Controller
//@RequestMapping("/majorOpration")
public class MajorOprationController {
    private final MajorOprationService majorOprationService;

    @Autowired
    MajorOprationController(MajorOprationService majorOprationService){
        this.majorOprationService = majorOprationService;
    }

    @RequestMapping("/updateMajorOpration")
    @ResponseBody
    public R update(@RequestBody MajorOprationDO majorOprationDO) {

        /**
         * 专业运营基础
         */
         int baseInfo = majorOprationService.updateBaseInfo(majorOprationDO.getBaseInfo());
        /**
         * 专业就业率
         */
         int majorRate = majorOprationService.updateMajorRate(majorOprationDO.getMajorRate());

        /**
         * 工程师行业背景人数，
         */
        int backgroundNum = majorOprationService.updateBackgroundNum(majorOprationDO.getBackgroundNum());

        return R.ok();
    }

    @RequestMapping("/getDetailMajorOpration")
    public String getByMajor(Model model) {
        /**
         * 专业运营基础
         */
        List<TitlePageNum> baseInfo = majorOprationService.getBaseInfo();
        /**
         * 专业就业率
         */
        List<MajorEmploymentRate> majorRate = majorOprationService.getMajorRate();

        /**
         * 工程师行业背景人数，
         */
        List<ProjectorBackground> backgroundNum = majorOprationService.getBackgroundNum();
        model.addAttribute("baseInfo",baseInfo);
        model.addAttribute("majorRate",majorRate);
        model.addAttribute("backgroundNum",backgroundNum);
        model.addAttribute("test","890");
        return "zhuanyeyunying";
    }


//    @RequestMapping("/index")
//    public ModelAndView index() {
//        ModelAndView modelAndView = new ModelAndView("index");
//        Map map = new HashMap();
//        map.put("name", "test001");
//        map.put("sex", "男");
//        map.put("age", "22");
//        modelAndView.addObject("list1", map);
//        modelAndView.addObject("list2", "这是第二个集合");
//
//        return modelAndView;
//    }

}
