package com.ljo.crm.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/23
 * Time: 22:50
 * 合同
 */
@Entity(name = "Contract")
@Table(name = "crm_contract")
public class Contract {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 200)
    private String name;

    @Column(length = 50)
    private String code;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column(length = 50)
    private String term; //期限

    @Column
    private Integer cpId; //产品分期

    @Column
    private Double productId;//产品

    @Column(length = 3000)
    private String remark;//备注

    @Column
    private Double totalPrice;//总价

    @Column(length = 100)
    private String operator; //经办人

    @Column
    private Integer hasKickback;//是否有回扣

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public Double getProductId() {
        return productId;
    }

    public void setProductId(Double productId) {
        this.productId = productId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getHasKickback() {
        return hasKickback;
    }

    public void setHasKickback(Integer hasKickback) {
        this.hasKickback = hasKickback;
    }
}
