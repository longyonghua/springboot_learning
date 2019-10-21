package com.longge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author longge
 * @create 2019-10-20 下午9:19
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello springboot1";
    }

    @RequestMapping("/hello1")
    @ResponseBody
    public Map<String,Object> hello2(){
        Map<String,Object> map = new HashMap<>();
        map.put("msg","hello world");
        return map;
    }

}
