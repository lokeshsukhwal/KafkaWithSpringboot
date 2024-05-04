package com.app.lokesh.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.app.lokesh.bean.UserActivity;

@Component
public class UserActivityProducer {
	
	 private static final String TOPIC = "user-activity";

	    @Autowired
	    private KafkaTemplate<String, UserActivity> kafkaTemplate;

	    public void sendUserActivity(UserActivity activity) {
	        kafkaTemplate.send(TOPIC, activity);
	    }
}
