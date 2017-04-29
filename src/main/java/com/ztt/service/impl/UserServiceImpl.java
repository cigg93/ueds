package com.ztt.service.impl;

import com.ztt.dao.jpa.UserDao;
import com.ztt.entity.user.User;
import com.ztt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ztt on 2017/3/19.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) throws Exception {
        return userDao.findByNameAndPasswordAndType(user.getName(), user.getPassword(), user.getType());
    }

    @Override
    public User queryUser(int userId) throws Exception {
        return userDao.findById(userId);
    }
}
