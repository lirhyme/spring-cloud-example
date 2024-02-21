package com.example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "mytopic", groupId = "mygroup")
    public void consumerFromTopic(String message) {
        System.out.println(message);
    }
}
