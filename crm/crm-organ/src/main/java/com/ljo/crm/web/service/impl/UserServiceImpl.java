package com.ljo.crm.web.service.impl;

import com.ljo.crm.pojo.User;
import com.ljo.crm.web.service.IUserService;
import com.ljo.crm.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * creator : jb.liang
 * time : 14:18
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void removeUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public List<Map> findUser(Map param) {
        return null;
    }

    @Override
    public List<User> findUserInfo(Map param) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
