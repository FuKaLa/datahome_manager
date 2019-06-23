package com.huatec.datahome.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转使用
 *
 * @author dingjiatian
 * @date 2019-06-21
 *
 */
@Controller
public class JumpController {

    /**
     * 跳转到路径
     *
     * @return 页面跳转路径
     */
    @RequestMapping("/myPlan")
    public String index(){
        return "myPlan";
    }

    @RequestMapping("/zhuanyeyunying")
    public String zhuanyeyunying(){
        return "login";
    }
//
//    @RequestMapping("/zhihuitea")
//    public String zhihuitea(){
//        return "zhihuitea";
//    }
//
//    @RequestMapping("/zhihuistu")
//    public String zhihuistu(){
//        return "zhihuistu";
//    }
//
//    @RequestMapping("/zhihuistu")
//    public String wisdomStudy3(Model model){
//    	model.addAttribute("ipAndPort", "hfdsfdn");
//        return "wisdomStudy3";
//    }
    
}
