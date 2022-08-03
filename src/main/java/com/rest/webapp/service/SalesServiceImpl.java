package com.rest.webapp.service;

import com.rest.webapp.repository.SalesDAO;
import com.rest.webapp.model.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Repository
public class SalesServiceImpl implements SalesService {
    @Autowired
    SalesDAO salesDAO;
    @Override
    public List getAllSalesDetail() {
        String[] testdata ={"Antony","","samy","","pandian"};
        List<String> dataList=Arrays.asList(testdata);
        String empty="";
        List<String> dummy=new ArrayList<>();
        String item1 = "Fruits";
        List<Sales> salesdata = salesDAO.findALl();
        Comparator<Sales> unitsold = Comparator.comparing(Sales::getUnitsSold);
        Comparator<Sales> city= Comparator.comparing(Sales::getCity);
        List<Sales> topTenSales=salesdata.stream().sorted(unitsold.reversed().thenComparing(city))
                    .limit(3)
                .collect(Collectors.toList());

        topTenSales.stream().forEach(System.out::println);
        System.out.println("**********************************************************************");
        List<Sales>salesItem=process(salesdata,(MobiSales)->MobiSales.getItemType().equals(item1));
        salesItem.stream().limit(5).forEach(item ->System.out.println(item));
        List<String> nameList=removeEmpty(dataList,(arraydata) -> arraydata.toString()!=empty);
        nameList.stream().forEach(name -> System.out.println(name));
        return dummy;
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

    public List<String> removeEmpty(List<String> datas, Predicate predicate){
        List<String> filteredList =new ArrayList<>();
        for(String s:datas){
            if(predicate.test(s)){
                filteredList.add(s);
            }
        }
        return filteredList;
    }

}
