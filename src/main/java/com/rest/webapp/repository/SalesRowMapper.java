package com.rest.webapp.repository;

import com.rest.webapp.model.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class SalesRowMapper implements RowMapper<Sales> {

    @Override
    public Sales mapRow(ResultSet rs, int rowNum) throws SQLException {

        Sales sale=new Sales();
        sale.setOrderID(rs.getString("orderID"));
        sale.setOrderPriority(rs.getString("Order Priority"));
        sale.setOrderDate(rs.getString("orderdate"));
        sale.setCity(rs.getString("city"));
        sale.setState(rs.getString("state"));
        sale.setType(rs.getString("type"));
        sale.setItemType(rs.getString("Item Type"));
        sale.setSalesChannel(rs.getString("Sales Channel"));
        sale.setUnitCost(rs.getDouble("unitCost"));
        sale.setUnitSellPrice(rs.getDouble("UnitSellPrice"));
        sale.setUnitsSold(rs.getInt("unitsSold"));
        sale.setTotalCost(rs.getDouble("TotalCost"));
        sale.setTotalProfit(rs.getDouble("TotalProfit"));
        sale.setTotalRevenue(rs.getDouble("Total Revenue"));

        return sale;
    }
}
