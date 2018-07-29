package com.ljo.crm.web.service.impl;

import com.ljo.crm.enums.VaildEnum;
import com.ljo.crm.pojo.Product;
import com.ljo.crm.web.service.IProductService;
import com.ljo.crm.dao.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * creator : jb.liang
 * time : 14:18
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public Product findProductById(Integer id) {
        return productDao.get(id);
    }

    @Override
    public void saveProduct(Product product) {
        productDao.saveOrUpdate(product);
    }

    @Override
    public void updateProduct(Product product) {
        productDao.merge(product);
    }

    @Override
    public void updateProduct(Integer id) {

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateProduct(Integer id, Map productMap) {
        productDao.updateProduct(id, productMap);
    }

    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void removeProduct(Integer id) {
        //productDao.removeProduct(id);
        Product product = this.findProductById(id);
        if(product != null){
            product.setRemoveFlag(VaildEnum.UNVAILD);
            this.saveProduct(product);
        }
    }

    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    @Transactional(readOnly = true)
    public Map tableProducts(Map param) {
        Map result = new HashMap();
        result.put("rows", productDao.findProductInfo(param));
        //result.put("rows", productDao.findProduct(param));
        result.put("total", productDao.findCountProducts());
        return result;
    }

    @Override
    public List<Product> findProductInfo(Map param) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return productDao.findAll();
    }
}
