package com.ljo.crm.pojo;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/23
 * Time: 22:32
 * 客户联系人
 */
@Entity(name = "Contact")
@Table(name = "crm_contact")
public class Contact {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Integer cId; //客户Id

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String phone;

    @Column(length = 50)
    private String telphone;

    @Column(length = 50)
    private String email;

    @Column(length = 50)
    private String fax;

    @Column
    private Integer sex;

    @Column(length = 150)
    private String address;

    @Column
    private Integer type; // 主要、辅助

    @Column
    private Integer removeFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRemoveFlag() {
        return removeFlag;
    }

    public void setRemoveFlag(Integer removeFlag) {
        this.removeFlag = removeFlag;
    }
}
