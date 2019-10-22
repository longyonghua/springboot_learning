package com.longge.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author longge
 * @create 2019-10-21 上午10:33
 */
@RestController
@ConfigurationProperties(prefix="person")
public class HelloController {

    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @RequestMapping("/hello")
    public String test(){
        return "name:"+name;
    }

}
