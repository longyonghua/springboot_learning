package com.longge.controller;

import com.longge.domain.User;
import com.longge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author longge
 * @create 2019-10-21 下午7:32
 */
@Controller
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/showUser")
    public String showUser(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User(1,"longge1",20));
        users.add(new User(2,"longge2",18));
        users.add(new User(3,"longge3",16));
        model.addAttribute("users",users);
        return "userList";
    }

    @RequestMapping("/showUser2")
    public String showUser2(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User(1,"longge1",20));
        users.add(new User(2,"longge2",21));
        users.add(new User(3,"longge3",22));
        model.addAttribute("users",users);
        return "userList";
    }

    @RequestMapping("/showInfo")
    public String showInfo(Model model){
        model.addAttribute("msg","Thymeleaf第一个案例");
        return "longge";
    }

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
    @RequestMapping("/addUser")
    public String addUser(User user){
        service.addUser(user);
        return "ok";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<User> users = service.findAll();
        model.addAttribute("users",users);
        return "showUsers";
    }

    @RequestMapping("/findById")
    public String findById(Integer id,Model model){
        User user = service.findUserById(id);
        model.addAttribute("user",user);
        return "updateUser";
    }

    @RequestMapping("/editUser")
    public String editUser(User user){
        service.updateUser(user);
        return "ok";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(Integer id){
        service.deleteById(id);
        return "redirect:/findAll";
    }

    @RequestMapping("/find")
    @ResponseBody
    public List<User> find(){
        List<User> list = service.findAll();
        return list;
    }
}
