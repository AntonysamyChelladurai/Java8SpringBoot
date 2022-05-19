package com.rest.webapp.repository;

import com.rest.webapp.model.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesDAOImpl implements SalesDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    SalesRowMapper salesRowMapper;
    String sql = "select * from first.\"Sales\"";


    @Override
    public List<Sales> findALl() {
        List<Sales> salesdata = jdbcTemplate.query(sql, salesRowMapper);
        return salesdata;
    }

    @Override
    public Sales getSalesdetailbyID() {
        return null;
    }

    @Override
    public List GetSalesbysate() {
        return null;
    }

    @Override
    public List getSalesbyDep() {
        return null;
    }

    @Override
    public int UpdateSalesDetails(Sales Sale) {
        return 0;
    }

    @Override
    public int DeleteSalesDetail(long orderID) {
        return 0;
    }
}
