package com.ljo.crm.dao.impl;

import com.ljo.crm.dao.IUserDao;
import com.ljo.crm.enums.VaildEnum;
import com.ljo.crm.pojo.User;
import com.ljo.crm.util.NumberUtil;
import com.ljo.crm.util.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
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
    public User load(Integer id) {
        return null;
    }

    @Override
    public User get(Integer id) {
        return (User) this.getCurrentSession().load(User.class, id);
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
    public Integer save(User entity) {
        return (Integer) this.getCurrentSession().save(entity);
    }

    @Override
    public void saveOrUpdate(User entity) {
        this.getCurrentSession().saveOrUpdate(entity);
    }

    @Override
    public void merge(User entity) {
        this.getCurrentSession().merge(entity);
    }

    @Override
    public void delete(Integer id) {
        User user = load(id);
        if(user != null) {
            this.getCurrentSession().delete(user);
        }
    }

    @Override
    public void flush() {

    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void removeUser(Integer id) {
        Session session = getCurrentSession();
        //Transaction transaction = session.beginTransaction();
        User user = null;
        Object obj =  session.get(User.class, id);
        if(obj != null){
            user = (User) obj;
            user.setRemoveFlag(VaildEnum.UNVAILD);
            session.update(user);
            //transaction.commit();
        }
        //session.close();
    }

    @Override
    public List<Map> findUser(Map param) {
        String sql = "";

        return null;
    }

    @Override
    public List<User> findUserInfo(Map param) {
        String sql = "select * from dc_user";
        String sort = StringUtil.safeToString(param.get("sort"), "");
        String order = StringUtil.safeToString(param.get("order"), "");
        if(StringUtils.isNotBlank(sort) && StringUtils.isNotBlank(order)) {
            sql +=" order by " + sort +" " + order;
        }
        SQLQuery query = this.getCurrentSession().createSQLQuery(sql);
        int page = NumberUtil.safeToInteger(param.get("page"), 1);
        int rows = NumberUtil.safeToInteger(param.get("rows"), 10);
        query.setFirstResult((page - 1) * rows);
        query.setMaxResults(rows);
        query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        return query.list();
    }

    @Override
    public void updateUser(Integer id, Map useMap) {
        Session session = getCurrentSession();
        User user = null;
        if(id != null && id.intValue() > 0){
            Object obj =  session.get(User.class, id);
            if(obj != null){
                user = (User) obj;
            }
        }
        if(user == null){
            user = new User();
        }
        user.setSex(NumberUtil.safeToInteger(useMap.get("sex"), 1));
        user.setUsername(StringUtil.safeToString(useMap.get("username"), null));
        user.setLoginname(user.getUsername());
        user.setPassword("1");
        session.saveOrUpdate(user);
    }

    @Override
    public Long findCountUsers() {
        return (Long) this.getCurrentSession().createQuery("select count(*) from User").uniqueResult();
    }
}
