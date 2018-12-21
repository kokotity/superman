package com.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller   //处理请求
public class HelloController {
    @RequestMapping("/koko")  //接受来自浏览器的hello请求
    @ResponseBody   //把内容写给浏览器
    public String hello(){
        return "杨超是世界上最帅的";
    }
}
