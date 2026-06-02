package com.example.emailservice.dto;

import javax.lang.model.element.Name;
import java.math.BigDecimal;
import java.util.List;

public class OrderItemMessage {
    private Long id;
    private String customerName;
    private List<ProductInfo> items;

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<ProductInfo> getItems() {
        return items;
    }

    public void setItems(List<ProductInfo> items) {
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private BigDecimal totalPrice;


}
