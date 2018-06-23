package com.ljo.crm.pojo;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/23
 * Time: 22:58
 * 合同补充协议
 */
@Entity(name = "ContactAgreement")
@Table(name = "crm_contactagreement")
public class ContactAgreement {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Integer productId;

    @Column
    private Integer buyNum;//购买数量

    @Column
    private Double unitPrice;//单价

    @Column
    private Double primeCost;//原价

    @Column
    private Double totalPrice;//总价

    @Column
    private Integer type;//培训费用等

    @Column
    private Integer contactId;//合同 id

    @Column
    private Double cost;//费用

    @Column(length = 3000)
    private String remark;//备注

    @Column(length = 100)
    private String operator; //经办人

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getPrimeCost() {
        return primeCost;
    }

    public void setPrimeCost(Double primeCost) {
        this.primeCost = primeCost;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
