package com.ztt.service;

import com.ztt.entity.user.User;

/**
 * Created by ccc on 2017/3/19.
 */
public interface UserService {
    User login(User user) throws Exception;

    User queryUser(int userId) throws Exception;
}
