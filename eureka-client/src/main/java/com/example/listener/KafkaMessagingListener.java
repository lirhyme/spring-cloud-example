package com.example.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessagingListener {

    @KafkaListener(groupId = "mygroup", topics = "topic")
    public void handle(String message) {
        System.out.println("message: " + message);
    }
}
