package com.zr.entity;

import javax.persistence.*;

/**
 * 在数据库字段和实体类不符时，如何解决
 */
@Entity
@Table(name = "user")
public class User {

    // 主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String userId;
    @Column(name = "name")
    private String username;
    @Column(name = "password")
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
