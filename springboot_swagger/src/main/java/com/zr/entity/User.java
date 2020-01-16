package com.zr.entity;


import sun.awt.SunHints;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = -2731598327208972274L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //配置主键的生成策略
    private Long id;

    private String name;
    private Integer age;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
