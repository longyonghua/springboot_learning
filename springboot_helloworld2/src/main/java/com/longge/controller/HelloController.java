package com.longge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author longge
 * @create 2019-10-21 上午10:33
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String test(){
        return "hello longge";
    }

}
