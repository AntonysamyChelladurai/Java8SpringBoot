package com.rest.webapp.controller;

import com.rest.webapp.model.Sales;
import com.rest.webapp.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class WebController {
    @Autowired
    SalesService salesService;
@GetMapping("/findAll")
    public List<Sales> getSalesDetails(){
        //InveteryService salesService =new InventoryServiceImpl();
        List<Sales> SalesList = salesService.getAllSalesDetail();;
        return SalesList;
    }

}
