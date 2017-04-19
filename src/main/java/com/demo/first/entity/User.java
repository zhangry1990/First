package com.demo.first.entity;

/**
 * 用户实体
 */
public class User {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printUser() {
        System.out.println("Spring 3 : Hello ! " + name);
    }
}
