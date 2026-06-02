package com.example.emailservice.dto;

import javax.lang.model.element.Name;
import java.math.BigDecimal;
import java.util.List;

public class OrderItemMessage {
    Long id;
    String customerName;
    List<ProductInfo> items;
    BigDecimal totalPrice;

    public boolean getItem() {
        return false;
    }

    public boolean getCustomerName() {
        return false;
    }
}
