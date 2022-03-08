package com.kafka.demo.springbootwithkafka;

import com.kafka.demo.springbootwithkafka.producer.Producer;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootWithKafkaApplicationTest {

    private static final String TOPIC = "users";
    private final Producer producer;

    SpringBootWithKafkaApplicationTest(@Autowired Producer producer) {
        this.producer = producer;
    }

//    @Test
//    @DisplayName("givenKafkaBroker_whenSendingtoSimpleProducer_thenMessageReceived")
//    public void givenKafkaBroker_whenSendingtoSimpleProducer_thenMessageReceived()
//            throws Exception {
//        final var messageToSend = "Sending with own simple KafkaProducer";
//        producer.sendMessage(messageToSend);
//        final var result  = consumer.getConsumedMessage();
//
//        Assertions.assertEquals(messageToSend, result);
//    }

}