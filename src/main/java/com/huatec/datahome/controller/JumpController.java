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

}
