package com.app.lokesh.consumer;

import org.springframework.core.annotation.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderProcessingConsumer {
	
	@KafkaListener(topics = "orders", groupId = "order-processing-group")
    public void processOrder(Order order) {
        // Process order and update inventory
    }
}
