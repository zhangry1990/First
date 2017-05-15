package com.demo.first.test;

import com.demo.first.dao.CustomerDao;
import com.demo.first.entity.Customer;
import com.demo.first.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DemoTest {

    /*@Test
    public void xmlTest() {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        User user = (User) context.getBean("userBean");
        user.printUser();
    }

    @Test
    public void customerTest() {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
        Customer customer = new Customer(4, "gggg",22);
        customerDao.insert(customer);

        Customer customer1 = customerDao.findByCustomerId(4);
        System.out.println(customer1.getName());
    }*/
}
