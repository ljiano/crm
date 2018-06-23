package com.ljo.crm.web.service;

import com.ljo.crm.pojo.Product;

import java.util.List;
import java.util.Map;

/**
 * creator : jb.liang
 * time : 14:17
 */
public interface IProductService {

    /**
     * 查询某个用户
     * @param id
     * @return
     */
    public Product findProductById(Integer id);

    /**
     * 保存用户
     * @param product
     */
    public void saveProduct(Product product);

    public void updateProduct(Product product);

    public void updateProduct(Integer id);

    public void updateProduct(Integer id, Map productMap);

    /**
     * 删除用户 /逻辑删除
     * @param id
     */
    public void removeProduct(Integer id);

    /**
     * 删除用户 /物理删除
     * @param product
     */
    public void deleteProduct(Product product);

    public List<Map> findProduct(Map param);

    public List<Product> findProductInfo(Map param);

    public List<Product> findAll();


}
