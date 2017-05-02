package com.demo.first.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 * 角色
 */
@Entity
@Table(name = "ROLE")
public class Role extends BaseEntity {

    // 主键ID
    @Id
    @GeneratedValue(generator = "defaultGenerator")
    @GenericGenerator(name = "defaultGenerator", strategy = "uuid")
    @Column(name = "ID", unique = true, nullable = false, length = 32)
    private String id;

    // 角色名称
    @Column(name = "ROLE_NAME")
    private String roleName;

    // 角色类型
    @Column(name = "ROLE_TYPE")
    private Integer roleType;

    // 角色KEY
    @Column(name = "ROLE_KEY")
    private String roleKey;

    // 角色排序
    @Column(name = "SEQUENCE")
    private Integer sequence;

    // 无参构造函数
    public Role() {

    }

    // 有参构造函数
    public Role(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleType=" + roleType +
                ", roleKey='" + roleKey + '\'' +
                ", sequence=" + sequence +
                '}';
    }
}
