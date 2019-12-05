package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by XIXI on 2019/10/25.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @RequestMapping("userlogin")
    public String queryAll(String name,String pwd){
       user= userService.find(name,pwd);
        System.out.println(user);
       if(user!=null){
           return "redirect:/emp/emplist";
       }else {
           return "redirect:/login.jsp";
       }
    }

    @RequestMapping("login")
    public String login(User user){
        userService.add(user);
        return "login";
    }
}
