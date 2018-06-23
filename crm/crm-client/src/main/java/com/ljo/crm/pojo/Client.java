package com.ljo.crm.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/23
 * Time: 22:14
 * 客户
 */
@Entity(name = "Client")
@Table(name = "crm_client")
public class Client {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 100)
    private String name;

    @Column(length = 200)
    private String address;

    @Column(length = 50)
    private String clientCode;

    @Column
    private Date registDate;

    @Column
    private Double registScale;

    @Column(length = 50)
    private String legal; // 法人

    @Column
    private Integer managerId; //管理人

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public Double getRegistScale() {
        return registScale;
    }

    public void setRegistScale(Double registScale) {
        this.registScale = registScale;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}
