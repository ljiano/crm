package com.ljo.crm.pojo;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/23
 * Time: 18:49
 * To change this template use File | Settings | File Templates.
 */
@Entity(name = "Product")
@Table(name = "dc_product")
public class Product {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String productName;
    @Column
    private Integer removeFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getRemoveFlag() {
        return removeFlag;
    }

    public void setRemoveFlag(Integer removeFlag) {
        this.removeFlag = removeFlag;
    }
}
