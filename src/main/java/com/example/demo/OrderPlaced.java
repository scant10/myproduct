package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderPlaced {
    String eventType;
    Long oredrId;
    Long productId;
    int qty;
    String productName;

}
