package com.swingspringer.practice.Playground.controller;

import com.swingspringer.practice.Playground.models.Health;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/health")
public class HealthController {
    private static final Logger log = Logger.getLogger(HealthController.class.getName());

    @GetMapping
    public ResponseEntity<Health> ping() {
        log.info("Ping");
        return ResponseEntity.ok(new Health(true));
    }

}
