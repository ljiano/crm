package com.ljo.crm.dao.impl;

import com.ljo.crm.dao.IUserDao;
import com.ljo.crm.pojo.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * creator : jb.liang
 * time : 17:09
 */
@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User load(Long id) {
        return null;
    }

    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        String hql = "from User";
        return this.getCurrentSession().createQuery(hql).list();
    }

    @Override
    public void persist(User entity) {

    }

    @Override
    public Long save(User entity) {
        return (Long) this.getCurrentSession().save(entity);
    }

    @Override
    public void saveOrUpdate(User entity) {
        this.getCurrentSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(Long id) {
        User user = load(id);
        if(user != null) {
            this.getCurrentSession().delete(user);
        }
    }

    @Override
    public void flush() {

    }

    private Session getCurrentSession() {
        return sessionFactory.openSession();
    }

    @Override
    public void removeUser(User user) {
        user.setRemoveFlag(1);
        saveOrUpdate(user);
    }

    @Override
    public List<Map> findUser(Map param) {
        String sql = "";

        return null;
    }

    @Override
    public List<User> findUserInfo(Map param) {
        Query query = this.getCurrentSession().createQuery(" from User as u where u.username like :username");
        query.setParameter("username", "%"+ param.get("username") +"%");
        return query.list();
    }
}
