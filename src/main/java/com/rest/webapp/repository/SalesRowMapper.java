package com.rest.webapp.repository;

import com.rest.webapp.model.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class SalesRowMapper implements RowMapper<Sales> {

    @Autowired
    Sales sales;

    @Override
    public Sales mapRow(ResultSet rs, int rowNum) throws SQLException {
        sales.setOrderID(rs.getString("orderID"));
        sales.setOrderPriority(rs.getString("OrderPriority"));
        sales.setOrderDate(rs.getString("orderdate"));
        sales.setCity(rs.getString("city"));
        sales.setState(rs.getString("state"));
        sales.setType(rs.getString("type"));
        sales.setItemType(rs.getString("ItemType"));
        sales.setSalesChannel(rs.getString("SalesChannel"));
        sales.setUnitCost(rs.getDouble("unitCost"));
        sales.setUnitSellPrice(rs.getDouble("UnitSellPrice"));
        sales.setUnitsSold(rs.getInt("unitsSold"));
        sales.setTotalCost(rs.getDouble("TotalCost"));
        sales.setTotalProfit(rs.getDouble("TotalProfit"));
        sales.setTotalRevenue(rs.getDouble("TotalRevenue"));

        return sales;
    }
}
