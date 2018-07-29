package com.ljo.crm.dao;

import com.ljo.crm.pojo.Product;

import java.util.List;
import java.util.Map;

/**
 * creator : jb.liang
 * time : 14:12
 */
public interface IProductDao extends BaseDao<Product, Integer> {

    /**
     * 删除用户 /逻辑删除
     * @param id
     */
    public void removeProduct(Integer id);

    public List<Map> findProduct(Map param);

    public Long findCountProducts();

    public List<Product> findProductInfo(Map param);

    public void updateProduct(Integer id, Map useMap);
}
