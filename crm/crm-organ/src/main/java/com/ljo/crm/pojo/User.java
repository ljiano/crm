package com.ljo.crm.pojo;

import javax.persistence.*;

/**
 * creator : jb.liang
 * time : 13:37
 */
@Entity(name = "User")
@Table(name = "dc_user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String username;
    @Column
    private String loginname;
    @Column
    private String password;
    @Column
    private Integer sex;
    @Column
    private Integer removeFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getRemoveFlag() {
        return removeFlag;
    }

    public void setRemoveFlag(Integer removeFlag) {
        this.removeFlag = removeFlag;
    }
}
