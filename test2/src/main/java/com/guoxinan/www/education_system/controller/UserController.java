package com.guoxinan.www.education_system.controller;

import com.guoxinan.www.education_system.pojo.User;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api
public class UserController {
    @PostMapping("/login")
    public   String  login(String username,String password){
        System.out.println("====登录===="+username);
        return  "成功";
    }

    @GetMapping("/select")
    public   String  select(String username){
        System.out.println("====模糊查询===="+username);
        return  "查询=成功";
    }

    @PostMapping ("/add")
    public   String  add(User user){
        System.out.println("====添加===="+user.getUsername());
        return  "成功";
    }
}
