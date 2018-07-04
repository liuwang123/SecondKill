package com.lw.service;

import com.lw.dao.UserDao;
import com.lw.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 56321 on 2018/7/4.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserById(int id){
        return userDao.getUserById(id);
    }
}
