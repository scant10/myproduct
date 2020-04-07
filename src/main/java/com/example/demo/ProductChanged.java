package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ProductChanged {
    String eventType;
    Long productId;
    String productName;
    int productStock;

    public ProductChanged()
    {
        this.eventType = this.getClass().getSimpleName();
    }
}
