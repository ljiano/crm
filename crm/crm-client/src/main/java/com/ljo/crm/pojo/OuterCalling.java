package com.ljo.crm.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/23
 * Time: 22:50
 * 外部联系
 */
@Entity(name = "OuterCalling")
@Table(name = "crm_outercalling")
public class OuterCalling {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Date callTime;

    @Column
    private Integer cpId;

    @Column
    private Double cost;

    @Column
    private Integer type;

    @Column(length = 1000)
    private String remark;

    @Column(length = 100)
    private String contractIds;//联系人

    @Column(length = 100)
    private String callers; // 陪同人员

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCallTime() {
        return callTime;
    }

    public void setCallTime(Date callTime) {
        this.callTime = callTime;
    }

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getContractIds() {
        return contractIds;
    }

    public void setContractIds(String contractIds) {
        this.contractIds = contractIds;
    }

    public String getCallers() {
        return callers;
    }

    public void setCallers(String callers) {
        this.callers = callers;
    }

}
