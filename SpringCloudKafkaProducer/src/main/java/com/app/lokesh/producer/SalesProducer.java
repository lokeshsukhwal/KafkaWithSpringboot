package com.app.lokesh.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.app.lokesh.bean.SalesData;

@Component
public class SalesProducer {
	private static final String TOPIC = "sales";

    @Autowired
    private KafkaTemplate<String, SalesData> kafkaTemplate;

    public void sendSalesData(SalesData salesData) {
        kafkaTemplate.send(TOPIC, salesData);
    }
}
