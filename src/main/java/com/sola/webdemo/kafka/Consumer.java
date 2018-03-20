package com.sola.webdemo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

//@Component
public class Consumer {

    @KafkaListener(topics = "testTopic")
    public void processMessage(SampleMessage message) {
        System.out.println("Received Sample message : " + message.toString());
    }


}
