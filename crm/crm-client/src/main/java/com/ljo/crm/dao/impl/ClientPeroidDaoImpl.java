package com.ljo.crm.dao.impl;

import com.ljo.crm.dao.IClientPeriodDao;
import com.ljo.crm.pojo.ClientPeriod;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/7/29
 * Time: 14:26
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class ClientPeroidDaoImpl implements IClientPeriodDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return this.sessionFactory.getCurrentSession();
    }
    @Override
    public ClientPeriod load(Integer id) {
        return (ClientPeriod) getCurrentSession().load(ClientPeriod.class, id);
    }

    @Override
    public ClientPeriod get(Integer id) {
        return (ClientPeriod) getCurrentSession().get(ClientPeriod.class, id);
    }

    @Override
    public List<ClientPeriod> findAll() {
        return null;
    }

    @Override
    public void persist(ClientPeriod entity) {

    }

    @Override
    public Integer save(ClientPeriod entity) {
        return (Integer) getCurrentSession().save(entity);
    }

    @Override
    public void saveOrUpdate(ClientPeriod entity) {
         getCurrentSession().saveOrUpdate(entity);
    }

    @Override
    public void merge(ClientPeriod entity) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void flush() {

    }

    @Override
    public List<Map> findUserClientPeroids(int oId, Map param) {
        String sql = "SELECT\n" +
                "  c. NAME,\n" +
                "  c.clientCode,\n" +
                "  cp.periodNo,\n" +
                "  cp.createTime,\n" +
                "  cp. STATUS,\n" +
                "  cp.endTime\n" +
                "FROM\n" +
                "  crm_clientperiod cp\n" +
                "INNER JOIN crm_client c ON cp.cId = c.id\n" +
                "WHERE\n" +
                "  c.managerId =:managerId";

        SQLQuery query = this.getCurrentSession().createSQLQuery(sql);
        query.setParameter("managerId", oId);
        query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        return query.list();
    }
}
