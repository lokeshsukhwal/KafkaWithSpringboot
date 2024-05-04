package com.app.lokesh.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.app.lokesh.bean.Order;

public class OrderProducer {
	private static final String TOPIC = "orders";

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    public void sendOrder(Order order) {
        kafkaTemplate.send(TOPIC, order);
    }
}
