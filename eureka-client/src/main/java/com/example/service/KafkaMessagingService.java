package com.example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaMessagingService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message) {
       kafkaTemplate.send("topic", message);
    }

}
