package com.app.lokesh.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.app.lokesh.bean.SalesData;

@Component
public class SalesAnalyticsConsumer {
	
	@KafkaListener(topics = "sales", groupId = "sales-analytics-group")
    public void processSalesData(SalesData salesData) {
        // Analyze sales data and generate insights
    }
}
