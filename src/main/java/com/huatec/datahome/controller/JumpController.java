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
     *登录跳转
     */
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    /**
     * 专业运营
     */

    @RequestMapping("/zhuanyeyunying")
    public String zhuanyeyunying(){
        return "zhuanyeyunying";
    }

    /**
     * 专业分析
     * majorName
     * @return
     */
    @RequestMapping("/zhuanyefenxi")
    public String zhuanyefenxi(){
        return "zhuanyefenxi";
    }

    /**
     * 智慧学习老师
     */
    @RequestMapping("/zhihuitea")
    public String zhihuitea(){
        return "zhihuitea";
    }
    /**
     * 智慧学习学生
     */
    @RequestMapping("/zhihuistu")
    public String zhihuistu(){
        return "zhihuistu";
    }

    /**
     * 就业分析
     * majorName
     * @return
     */
    @RequestMapping("/jiuyefenxi")
    public String jiuyefenxi(){
        return "jiuyefenxi";
    }

//    @RequestMapping("/zhihuistu")
//    public String wisdomStudy3(Model model){
//    	model.addAttribute("ipAndPort", "hfdsfdn");
//        return "wisdomStudy3";
//    }
    
}
