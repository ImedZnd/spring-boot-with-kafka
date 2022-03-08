package com.example.secondservicekafka.consumer;

import com.example.secondservicekafka.model.User;
import com.example.secondservicekafka.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    private UserRepository userRepository;
    private static final String TOPIC = "gg";
    private static final String GROUPID = "gg";

    @KafkaListener(topics = TOPIC, groupId = GROUPID)
    public void consume(User user) {
        System.out.println("consumed user = " + user);
        userRepository.save(user);
    }
}