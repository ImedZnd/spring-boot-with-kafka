package com.kafka.demo.springbootwithkafka.restController;

import com.kafka.demo.springbootwithkafka.models.User;
import com.kafka.demo.springbootwithkafka.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish/user")
    public void sendMessageToKafkaTopic(
            @RequestBody User user
    ) {
        this.producer.sendMessage(user);
    }
}
