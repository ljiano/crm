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
    public void removeUser(Integer id);

    public List<Map> findUser(Map param);

    public List<User> findUserInfo(Map param);

    public void updateUser(Integer id, Map useMap);
}
