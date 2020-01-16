package com.zr.entity;

import javax.persistence.*;

@Table(name = "spring..t_user_role")
public class TUserRole {
    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "RID")
    private Integer rid;

    /**
     * @return USER_ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return RID
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * @param rid
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }
}