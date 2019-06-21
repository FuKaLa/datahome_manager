package com.huatec.datahome.controller;

import com.huatec.datahome.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/21.
 */
@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        Map map = new HashMap();
        map.put("name", "test001");
        map.put("sex", "男");
        map.put("age", "22");
        modelAndView.addObject("list1", map);
        modelAndView.addObject("list2", "这是第二个集合");

        return modelAndView;
    }
}
