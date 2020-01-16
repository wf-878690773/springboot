package com.zr.entity;

import javax.persistence.*;

@Table(name = "spring..t_role_permission")
public class TRolePermission {
    @Column(name = "RID")
    private Integer rid;

    @Column(name = "PID")
    private Integer pid;

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

    /**
     * @return PID
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}