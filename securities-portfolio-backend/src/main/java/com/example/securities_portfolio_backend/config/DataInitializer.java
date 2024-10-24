package com.example.securities_portfolio_backend.config;

import com.example.securities_portfolio_backend.model.Security;
import com.example.securities_portfolio_backend.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import java.util.Arrays;

//@Component
//public class DataInitializer {
//
//    @Autowired
//    private SecurityRepository securityRepository;
//
//    @PostConstruct
//    public void loadData() {
//        // Only load data if the repository is empty
//        if (securityRepository.count() == 0) {
//            Security security1 = new Security();
//            security1.setName("Apple Inc.");
//            security1.setType("Equity");
//            security1.setPrice(175.32);
//            security1.setQuantity(50);
//
//            Security security2 = new Security();
//            security2.setName("Tesla Inc.");
//            security2.setType("Equity");
//            security2.setPrice(265.21);
//            security2.setQuantity(30);
//
//            Security security3 = new Security();
//            security3.setName("US Treasury Bond");
//            security3.setType("Fixed Income");
//            security3.setPrice(1500.00);
//            security3.setQuantity(10);
//
//            securityRepository.saveAll(Arrays.asList(security1, security2, security3));
//
//            System.out.println("Initial securities data loaded!");
//        } else {
//            System.out.println("Database already contains data. Skipping initialization.");
//        }
//    }
//}
