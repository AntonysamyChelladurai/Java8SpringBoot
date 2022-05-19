package com.rest.webapp.repository;

import com.rest.webapp.model.Sales;
import org.springframework.stereotype.Component;

import java.util.List;

public interface SalesDAO {
    List<Sales> findALl();
    Sales getSalesdetailbyID();
    List GetSalesbysate();
    List getSalesbyDep();
    int UpdateSalesDetails(Sales Sale);
    int DeleteSalesDetail(long orderID);
}
