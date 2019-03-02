package com.ljo.crm.dao;

import com.ljo.crm.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * creator : jb.liang
 * time : 14:12
 */
public interface IUserDao extends BaseDao<User, Integer> {

    /**
     * 删除用户 /逻辑删除
     * @param id
     */
    void removeUser(Integer id);

    List<Map> findUser(Map param);

    List<User> findUserInfo(Map param);

    void updateUser(Integer id, Map useMap);

    Long findCountUsers();
}
