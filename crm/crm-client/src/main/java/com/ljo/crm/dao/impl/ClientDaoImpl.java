package com.ljo.crm.dao.impl;

import com.ljo.crm.dao.IClientDao;
import com.ljo.crm.pojo.Client;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/24
 * Time: 17:10
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class ClientDaoImpl implements IClientDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Client> findClients() {
        String hql = " from Client";
        Query query = this.getCurrentSession().createQuery(hql);
        return query.list();
    }

    @Override
    public List<Map> findClientsByParam(Map param) {
        return null;
    }

    @Override
    public Client load(Integer id) {
        return null;
    }

    @Override
    public Client get(Integer id) {
        Object obj =  getCurrentSession().get(Client.class, id);
        if(obj != null){
            return (Client) obj;
        }
        return null;
    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public void persist(Client entity) {

    }

    @Override
    public Integer save(Client entity) {
        if(entity != null) {
            return (Integer) this.getCurrentSession().save(entity);
        }
        return null;
    }

    @Override
    public void saveOrUpdate(Client entity) {
        if(entity != null) {
            this.getCurrentSession().saveOrUpdate(entity);
        }
    }

    @Override
    public void merge(Client entity) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void flush() {

    }

    @Override
    public List<Client> findUserClients(int oId, Map param) {
        String hql = "from Client where managerId=:managerId";
        Query query = this.getCurrentSession().createQuery(hql).setParameter("managerId", oId);
        if(param != null && !param.isEmpty()){
            //todo
        }
        return query.list();
    }
}
