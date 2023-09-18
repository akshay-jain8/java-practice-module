package com.softdebugs.javapracticemodule.controller;

import com.softdebugs.javapracticemodule.apachekafka.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApacheKafkaController {

    @Autowired
    private Producer producer;

    @GetMapping("/send/apache/kafka/message")
    public void sendApacheKafkaMessage(@RequestParam("message") String message) {
        producer.produceMessage(message);
    }
}
