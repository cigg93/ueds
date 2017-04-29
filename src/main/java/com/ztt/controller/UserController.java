package com.ztt.controller;

import com.ztt.base.entity.ResultInfo;
import com.ztt.entity.user.User;
import com.ztt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ztt on 2017/3/19.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public User login(@RequestBody User user) throws Exception {
        User userInfo = null;
        try {
            userInfo = userService.login(user);
            /*userInfo.setCode("0");
            userInfo.setMsg("成功");*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userInfo;
    }

    @RequestMapping(value = "{userId}/info", method = RequestMethod.GET)
    public User queryUser(@PathVariable int userId) throws Exception {
        return userService.queryUser(userId);
    }











}
