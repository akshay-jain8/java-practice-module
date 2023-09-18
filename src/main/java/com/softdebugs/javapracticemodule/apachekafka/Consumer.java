package com.softdebugs.javapracticemodule.apachekafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "MyFirstTopic", groupId = "consumerGroup1")
    public void consumerMessage(String message) {
        System.out.println("Message is: " + message);
    }
}
