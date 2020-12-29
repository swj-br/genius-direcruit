package com.sfac.geniusdirecruit.hsyetem.controller;

import com.sfac.geniusdirecruit.hsyetem.entity.User;
import com.sfac.geniusdirecruit.hsyetem.service.UserService;
import com.sfac.geniusdirecruit.common.entity.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 127.0.0.1/api/category ---- post
     * {"name":"电子产品"}
     */
    @PostMapping(value = "/category", consumes = "application/json")
    public String insertCategory(@RequestBody User user) {
        userService.insertUser(user);
        return "This is test module desc.";
    }
}
