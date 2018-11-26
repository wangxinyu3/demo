package com.imooc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.User;

@RestController        // @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserContoller {

    @RequestMapping("/getUser")
    public User getUser() {

        User u = new User();
        u.setName("imooc2");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("imooc2");
        u.setDesc("hello imooc2~~");

        return u;
    }
}