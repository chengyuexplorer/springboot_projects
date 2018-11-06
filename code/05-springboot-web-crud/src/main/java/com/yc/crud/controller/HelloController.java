package com.yc.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author lenovo
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hellWorld(){
        return "hello world!";
    }

    @RequestMapping("/success")
    public String success(Map<String,String> map){
        map.put("hello","你好！");
        return "success";
    }
}
