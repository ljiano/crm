package com.ljo.crm.web.service.impl;

import com.ljo.crm.dao.IUserDao;
import com.ljo.crm.enums.VaildEnum;
import com.ljo.crm.pojo.User;
import com.ljo.crm.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * creator : jb.liang
 * time : 14:18
 */
@Service
@Transactional //默认(传播)propagation=Propagation.REQUIRED所以不像集中式声明那样都要配置
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User findUserById(Integer id) {
        return userDao.get(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveOrUpdate(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.merge(user);
    }

    @Override
    public void updateUser(Integer id) {

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateUser(Integer id, Map userMap) {
        userDao.updateUser(id, userMap);
    }

    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void removeUser(Integer id) {
        //userDao.removeUser(id);
        User user = this.findUserById(id);
        if(user != null){
            user.setRemoveFlag(VaildEnum.UNVAILD);
            this.saveUser(user);
        }
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public Map tableUser(Map param) {
        Map result = new HashMap();
        result.put("rows", userDao.findUserInfo(param));
        result.put("total", userDao.findCountUsers());
        return result;
    }

    @Override
    public List<User> findUserInfo(Map param) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userDao.findAll();
    }
}
