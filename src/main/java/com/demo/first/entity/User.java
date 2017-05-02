package com.demo.first.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 用户
 */
@Entity
@Table(name = "USER")
public class User extends BaseEntity {

    // 主键ID
    @Id
    @GeneratedValue(generator = "defaultGenerator")
    @GenericGenerator(name = "defaultGenerator", strategy = "uuid")
    @Column(name = "ID", unique = true, nullable = false, length = 32)
    private String id;

    // 用户名
    @Column(name = "USERNAME")
    private String username;

    // 密码
    @Column(name = "PASSWORD")
    private String password;

    // 姓名
    @Column(name = "NAME")
    private String name;

    // 性别（0：男；1：女）
    @Column(name = "SEX")
    private Integer sex;

    // 年龄
    @Column(name = "AGE")
    private Integer age;

    // 电话
    @Column(name = "TELPHONE")
    private String telphone;

    // 地址
    @Column(name = "ADDRESS")
    private String address;

    // 无参构造函数
    public User() {

    }

    // 有参构造函数
    public User(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", telphone='" + telphone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
