package com.qianfeng.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class TestController {

    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/show")
    @ResponseBody
    public String show(){
        return "show";
    }
}
