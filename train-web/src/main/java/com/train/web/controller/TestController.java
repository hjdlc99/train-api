package com.train.web.controller;

import com.train.manager.model.User;
import com.train.service.IUserManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    IUserManagement userManagement;

    @GetMapping("page")
    public String testPage(){
        return "这是一个springboot页面！";
    }


    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String queryUserInfo(){
        User user = userManagement.queryUserInfo();
       return user.toString();
    }

}
