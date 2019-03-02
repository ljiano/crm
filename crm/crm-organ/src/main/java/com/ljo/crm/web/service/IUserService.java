package com.ljo.crm.web.service;

import com.ljo.crm.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * creator : jb.liang
 * time : 14:17
 */
public interface IUserService {

    /**
     * 查询某个用户
     * @param id
     * @return
     */
    public User findUserById(Integer id);

    /**
     * 保存用户
     * @param user
     */
    public void saveUser(User user);

    public void updateUser(User user);

    public void updateUser(Integer id);

    public void updateUser(Integer id, Map userMap);

    /**
     * 删除用户 /逻辑删除
     * @param id
     */
    public void removeUser(Integer id);

    /**
     * 删除用户 /物理删除
     * @param user
     */
    public void deleteUser(User user);

    public Map tableUser(Map param);

    public List<User> findUserInfo(Map param);

    public List<User> findAll();


}
