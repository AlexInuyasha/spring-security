package com.hzy.gpspringbootfreemarker.controller;

import com.hzy.gpspringbootfreemarker.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserController
 * @Aauthor zhengyang.hu
 * @Date 2021/2/18
 **/
@Controller
public class UserController {

    @RequestMapping("/user")
    public String userInfo(Model model){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setAge(10).setId(1).setName("张三");
        list.add(user);
        System.out.println("aaaaa");
        model.addAttribute("list",list);
        return "user";
    }

    @RequestMapping("/show")
    public String showInfo(Model model){
        model.addAttribute("msg","hello");
        System.out.println("aaaaa");
        return "index";
    }

    @RequestMapping("/show1")
    public String show1(){
        String msg = null;
        msg.length();
        return "success";
    }

    @RequestMapping("/show2")
    public String show2(){
        int a = 1/0;
        return "success";
    }

}
