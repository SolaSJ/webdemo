package com.sola.webdemo.kafka;

import org.apache.ibatis.javassist.tools.rmi.Sample;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

//@Component
public class Producer {

    private final KafkaTemplate<Object, SampleMessage> kafkaTemplate;

    public Producer(KafkaTemplate<Object, SampleMessage> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(SampleMessage message) {
        this.kafkaTemplate.send("Hello kafka", message);
        System.out.println("Sent sample message : " + message);
    }

}
