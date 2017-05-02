package com.demo.first.entity;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * 实体基类
 */
public abstract class BaseEntity {

    // 创建人
    @Column(name = "CREATED_USER")
    private String createdUser;

    // 创建时间
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_TIME")
    private Date createdTime;

    // 修改人
    @Column(name = "MODIFIED_USER")
    private String modifiedUser;

    // 修改时间
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MODIFIED_TIME")
    private Date modifiedTime;

    // 删除人
    @Column(name = "DELETED_USER")
    private String deletedUser;

    // 删除时间
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DELETED_TIME")
    private Date deletedTime;

    // 删除标志（0：未删除；1：已删除）
    @Column(name = "DELETED_FLAG")
    private Integer deletedFlag;

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getDeletedUser() {
        return deletedUser;
    }

    public void setDeletedUser(String deletedUser) {
        this.deletedUser = deletedUser;
    }

    public Date getDeletedTime() {
        return deletedTime;
    }

    public void setDeletedTime(Date deletedTime) {
        this.deletedTime = deletedTime;
    }

    public Integer getDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(Integer deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                ", deletedUser='" + deletedUser + '\'' +
                ", deletedTime=" + deletedTime +
                ", deletedFlag=" + deletedFlag +
                '}';
    }

}
