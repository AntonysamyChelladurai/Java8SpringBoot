package com.rest.webapp.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class MobileSales extends Sales{

    private String orderID;
    private String orderDate;
    private String city;
    private String state;
    private String type;
    private double unitCost;
    private int unitsSold;
    private double TotalRevenue;
    private double TotalCost;
    private double TotalProfit;
    private String ItemType;
    private String SalesChannel;
    private String OrderPriority;
    private double UnitSellPrice;

}