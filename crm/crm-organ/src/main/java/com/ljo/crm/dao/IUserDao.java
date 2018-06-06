package com.ljo.crm.dao;

import com.ljo.crm.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * creator : jb.liang
 * time : 14:12
 */
public interface IUserDao extends BaseDao<User, Long> {

    /**
     * 删除用户 /逻辑删除
     * @param user
     */
    public void removeUser(User user);

    public List<Map> findUser(Map param);

    public List<User> findUserInfo(Map param);
}
