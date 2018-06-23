package com.ljo.crm.dao.impl;

import com.ljo.crm.enums.VaildEnum;
import com.ljo.crm.util.StringUtil;
import com.ljo.crm.dao.IProductDao;
import com.ljo.crm.pojo.Product;
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
public class ProductDaoImpl implements IProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Product load(Integer id) {
        return null;
    }

    @Override
    public Product get(Integer id) {
        return (Product) this.getCurrentSession().load(Product.class, id);
    }

    @Override
    public List<Product> findAll() {
        String hql = "from Product";
        return this.getCurrentSession().createQuery(hql).list();
    }

    @Override
    public void persist(Product entity) {

    }

    @Override
    public Integer save(Product entity) {
        return (Integer) this.getCurrentSession().save(entity);
    }

    @Override
    public void saveOrUpdate(Product entity) {
        this.getCurrentSession().saveOrUpdate(entity);
    }

    @Override
    public void merge(Product entity) {
        this.getCurrentSession().merge(entity);
    }

    @Override
    public void delete(Integer id) {
        Product product = load(id);
        if(product != null) {
            this.getCurrentSession().delete(product);
        }
    }

    @Override
    public void flush() {

    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void removeProduct(Integer id) {
        Session session = getCurrentSession();
        //Transaction transaction = session.beginTransaction();
        Product product = null;
        Object obj =  session.get(Product.class, id);
        if(obj != null){
            product = (Product) obj;
            product.setRemoveFlag(VaildEnum.UNVAILD);
            session.update(product);
            //transaction.commit();
        }
        //session.close();
    }

    @Override
    public List<Map> findProduct(Map param) {
        String sql = "";

        return null;
    }

    @Override
    public List<Product> findProductInfo(Map param) {
        Query query = this.getCurrentSession().createQuery(" from Product as u where u.productname like :productname");
        query.setParameter("productname", "%"+ param.get("productname") +"%");
        return query.list();
    }

    @Override
    public void updateProduct(Integer id, Map useMap) {
        Session session = getCurrentSession();
        Product product = null;
        if(id != null && id.intValue() > 0){
            Object obj =  session.get(Product.class, id);
            if(obj != null){
                product = (Product) obj;
            }
        }
        if(product == null){
            product = new Product();
        }
        product.setProductName(StringUtil.safeToString(useMap.get("productName"), null));
        session.saveOrUpdate(product);
    }
}
