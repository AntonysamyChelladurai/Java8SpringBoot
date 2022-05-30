package com.rest.webapp.repository;

import com.rest.webapp.model.Sales;
import org.springframework.stereotype.Component;

import java.util.List;

public interface SalesDAO {
    List<Sales> findALl();
    Sales getSalesdetailbyID();
    List getSalesbysate();
    List getSalesbyDep();
    int updateSalesDetails(Sales sales);
    int deleteSalesDetail(long orderID);

    int insertSalesDetail(Sales sales);
}
