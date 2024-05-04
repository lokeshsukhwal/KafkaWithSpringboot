package com.app.lokesh.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.app.lokesh.bean.UserActivity;

@Component
public class AnalyticsConsumer {
	
	 @KafkaListener(topics = "user-activity", groupId = "analytics-group")
	    public void processUserActivity(UserActivity activity) {
	        // Process user activity and generate analytics
	    }
}
