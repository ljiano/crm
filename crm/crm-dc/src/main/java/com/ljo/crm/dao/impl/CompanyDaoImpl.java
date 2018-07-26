package com.ljo.crm.dao.impl;

import com.ljo.crm.dao.ICompanyDao;
import com.ljo.crm.util.NumberUtil;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/7/25
 * Time: 14:50
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class CompanyDaoImpl implements ICompanyDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional(readOnly = true)
    @Override
    public List<Map> findCompanys(Map map) {
        StringBuilder sql = new StringBuilder("select \n" +
                " c.gsmc companyname,\n" +
                " c.companycode,\n" +
                " c.zcdz address,\n" +
                " c.qsrq qsdate,\n" +
                " c.zccs city,\n" +
                " c.pinyin,\n" +
                " c.guid\n" +
                "from dc_company c");
        SQLQuery query = this.getCurrentSession().createSQLQuery(sql.toString());
        int page = NumberUtil.safeToInteger(map.get("page"), 1);
        int rows = NumberUtil.safeToInteger(map.get("rows"), 10);
        query.setFirstResult((page - 1) * rows);
        query.setMaxResults(rows);
        query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        return query.list();
    }

    @Transactional(readOnly = true)
    @Override
    public Long findCountCompanys(){
        String sql = " select count(*) from dc_company";
        SQLQuery query = this.getCurrentSession().createSQLQuery(sql);
        return ((BigInteger)query.list().get(0)).longValue();
    }

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}
