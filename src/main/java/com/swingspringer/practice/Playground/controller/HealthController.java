package com.swingspringer.practice.Playground.controller;

import com.swingspringer.practice.Playground.kafka.producer.PlaygroundKafkaProducer;
import com.swingspringer.practice.Playground.models.Health;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/health")
@RequiredArgsConstructor
public class HealthController {
    private static final Logger log = Logger.getLogger(HealthController.class.getName());
    private final PlaygroundKafkaProducer playgroundKafkaProducer;

    @GetMapping
    public ResponseEntity<Health> ping() {
//        playgroundKafkaProducer.sendMessage("health", new Date().toString());
        log.info("Ping");
        return ResponseEntity.ok(new Health(true));
    }

}
