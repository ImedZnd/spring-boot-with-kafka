package com.kafka.demo.springbootwithkafka.producer;

import com.kafka.demo.springbootwithkafka.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final String TOPIC = "gg";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(User message) {
        this.kafkaTemplate.send(TOPIC, message);
        System.out.println("input produced message = " + message);    }
}