package com.example.controller;

import com.example.service.KafkaMessagingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class KafkaMessagingController {

   private final KafkaMessagingService kafkaMessagingService;

    @GetMapping("/send/{message}")
    public String send(@PathVariable String message) {
       kafkaMessagingService.send(message);
       return message;
    }

    @GetMapping("/hello")
    public String hello() {
        return "send";
    }
}
