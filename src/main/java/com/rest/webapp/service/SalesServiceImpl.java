package com.rest.webapp.service;

import com.rest.webapp.repository.SalesDAO;
import com.rest.webapp.model.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Repository
public class SalesServiceImpl implements SalesService {
    @Autowired
    SalesDAO salesDAO;
    @Override
    public List getAllSalesDetail() {
        String item1 = "Fruits";
       /* Consumer<List<Sales>> orderData = (sales) -> sales.forEach(sale -> {
            System.out.println(" Order ID :: " + sale.getOrderID());
        });*/
        Consumer<List<Sales>> Salesrecord = (sales) -> sales.forEach(sale -> {
            System.out.println(" Sales :: " + sale.toString());
        });
        Consumer<List<String>> orderCitys = (citys) -> citys.forEach(System.out::println);
        Function<List<Sales>, List<String>> orderDetails = (saleslist) -> saleslist.stream()
                .map(sales -> sales.getCity().toUpperCase())
                .collect(Collectors.toList());
        List<Sales> salesdata = salesDAO.findALl();
        List<Sales>salesItem=process(salesdata,(Sales)->Sales.getItemType().equals(item1));
        //orderData.accept(salesdata);
        //orderData.accept(salesdata);
        System.out.println("**********************************************************");
        System.out.println(orderDetails);
        System.out.println("**********************************************************");
        orderCitys.accept(orderDetails.apply(salesdata));
        System.out.println("**********************************************************");
        System.out.println("Filter With ItemType :: Fruits");
        Salesrecord.accept(salesItem);
        Map<String, List<Sales>> groupbyCity = salesdata.stream().collect(Collectors.groupingBy(Sales::getState));
        System.out.println("**********************************************************");
        System.out.println(groupbyCity.get("Bihar"));
        System.out.println("**********************************************************");
        List<Sales> salessorteddata=salesdata.stream().sorted(Comparator.comparingInt(Sales::getUnitsSold)).collect(Collectors.toList());
        System.out.println("**********************************************************");
        salessorteddata.forEach(System.out::println);
        return salesdata;
    }

    @Override
    public ResponseEntity createSalesData(@RequestBody Sales sales)
    {
        return ResponseEntity.ok(salesDAO.insertSalesDetail(sales));
    }

    public List<Sales>process(List<Sales>Sales,Predicate<Sales> predicate){
        List<Sales> saleItem = new ArrayList<>();
        for (Sales sale:Sales) {
            if(predicate.test(sale)){
                saleItem.add(sale);
            }
        }
        return saleItem;
    }

}
