package com.huatec.datahome.controller;

import com.huatec.datahome.domain.*;
import com.huatec.datahome.service.MajorOprationService;
import com.huatec.datahome.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/majorOpration")
public class MajorOprationController {
    private final MajorOprationService majorOprationService;

    @Autowired
    MajorOprationController(MajorOprationService majorOprationService){
        this.majorOprationService = majorOprationService;
    }

    @RequestMapping("/update")
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

    @RequestMapping("/getDetail")
    @ResponseBody
    public R getByMajor() {
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

        MajorOprationDO aDo = new MajorOprationDO();
        aDo.setBackgroundNum(backgroundNum);
        aDo.setBaseInfo(baseInfo);
        aDo.setMajorRate(majorRate);
        return R.resultData(aDo);
    }

}
