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
    public User findUserById(Long id);

    /**
     * 保存用户
     * @param user
     */
    public void saveUser(User user);

    /**
     * 删除用户 /逻辑删除
     * @param user
     */
    public void removeUser(User user);

    /**
     * 删除用户 /物理删除
     * @param user
     */
    public void deleteUser(User user);

    public List<Map> findUser(Map param);

    public List<User> findUserInfo(Map param);

    public List<User> findAll();


}
