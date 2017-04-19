package com.demo.first.dao.impl;

import com.demo.first.dao.CustomerDao;
import com.demo.first.entity.Customer;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zhangry on 2017/4/19.
 */
public class CustomerDaoImpl implements CustomerDao {

    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public void insert(Customer customer) {
        String sql = "INSERT INTO CUSTOMER " +
                "(ID, NAME, AGE) VALUES (?, ?, ?)";

        jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(sql, new Object[] { customer.getId(),
                customer.getName(),customer.getAge()
        });
    }

    @Override
    public Customer findByCustomerId(int id) {
        String sql = "SELECT * FROM CUSTOMER WHERE ID = ?";

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            Customer customer = null;
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                customer = new Customer(
                        rs.getInt("ID"),
                        rs.getString("NAME"),
                        rs.getInt("AGE")
                );
            }
            rs.close();
            ps.close();
            return customer;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
