package com.ljo.crm.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/23
 * Time: 22:53
 * 收益及支出
 */
@Entity(name = "Income")
@Table(name = "crm_income")
public class Income {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Integer cpId;

    @Column
    private Date changeDate;

    @Column
    private Integer changeType;

    @Column
    private Double changeMoney;

    @Column
    private Integer incomeLogId;

    @Column
    private Integer contractId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public Double getChangeMoney() {
        return changeMoney;
    }

    public void setChangeMoney(Double changeMoney) {
        this.changeMoney = changeMoney;
    }

    public Integer getIncomeLogId() {
        return incomeLogId;
    }

    public void setIncomeLogId(Integer incomeLogId) {
        this.incomeLogId = incomeLogId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }
}
