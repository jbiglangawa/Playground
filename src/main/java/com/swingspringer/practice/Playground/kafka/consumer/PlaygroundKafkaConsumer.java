package com.swingspringer.practice.Playground.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PlaygroundKafkaConsumer {

    @KafkaListener(topics = "health", groupId = "playground-group-id", autoStartup = "${listen.auto.start:false}")
    public void health(String message) {
        System.out.println("Received message: for health " + message);
    }

}
