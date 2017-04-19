package com.demo.first.dao;

import com.demo.first.entity.Customer;

/**
 * Created by zhangry on 2017/4/19.
 */
public interface CustomerDao {


    public void insert(Customer customer);
    public Customer findByCustomerId(int id);

}
