package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private Producer producer;

    @GetMapping("/{msg}")
    public void sendMessage(@PathVariable String msg) {
        producer.publishToTopic(msg);
    }

}
