package com.sreeram.kafkatutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaListener {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaListener.class);

    @org.springframework.kafka.annotation.KafkaListener (topics = "${kafka.test.topic}")
    public void onMessage(@Payload String message) {

        System.out.println(message);
    }
}
