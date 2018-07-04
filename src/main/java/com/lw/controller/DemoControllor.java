package com.lw.controller;

import com.lw.entity.User;
import com.lw.result.Result;
import com.lw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 56321 on 2018/7/4.
 */
@Controller
@RequestMapping("/demo")
public class DemoControllor {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser/{id}")
    @ResponseBody
    public Result<User> getUserById(@PathVariable int id){
        return Result.success(userService.getUserById(id));
    }
}
