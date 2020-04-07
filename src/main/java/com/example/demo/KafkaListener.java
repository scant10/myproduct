package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaListener {

    @Autowired
    private ProductRepository productRepository;

    @StreamListener(Processor.INPUT)
    public void onEventByString(@Payload OrderPlaced orderPlaced){
        if(orderPlaced.getEventType().equals(("OrderPlaced"))) {
            System.out.println("---------------------------");
            System.out.println("재고량 수정");
            Product product = new Product();
            product.setName(orderPlaced.getProductName());

            final Product saveProduct = productRepository.save(product);

            System.out.println("---------------------------");
        }
    }
}
