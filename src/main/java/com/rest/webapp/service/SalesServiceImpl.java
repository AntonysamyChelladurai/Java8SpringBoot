package com.rest.webapp.service;

import com.rest.webapp.repository.SalesDAO;
import com.rest.webapp.repository.SalesRowMapper;
import com.rest.webapp.model.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SalesServiceImpl implements SalesService {

    @Autowired
    SalesDAO salesDAO;

    @Override
    public List getAllSalesDetail() {
        List<Sales>salesdata= salesDAO.findALl();
        return salesdata;
    }

}
