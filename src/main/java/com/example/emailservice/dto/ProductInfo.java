package com.example.emailservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductInfo {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;

    public String getProductName() {
        return name;
    }


    }


