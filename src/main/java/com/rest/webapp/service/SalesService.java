package com.rest.webapp.service;

import com.rest.webapp.model.Sales;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface SalesService {
    List getAllSalesDetail();

    ResponseEntity createSalesData(Sales sales);


}
