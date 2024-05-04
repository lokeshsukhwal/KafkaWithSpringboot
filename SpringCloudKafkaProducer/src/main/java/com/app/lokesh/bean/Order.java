package com.app.lokesh.bean;

import lombok.Data;

@Data
public class Order {
    private String orderId;
    private String productId;
    private int quantity;
    private double totalPrice;
    
    // Constructors, getters, and setters
}
