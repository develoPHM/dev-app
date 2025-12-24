package com.example.k3s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HpaRunController {
    @GetMapping("/HpaRun")
    public String hpaRun() {
        long end = System.currentTimeMillis() + 3000;

        double x = 0.0001;
        while (System.currentTimeMillis() < end) {
            x = Math.sqrt(x + Math.random());
        }

        return "HPA RUN OK";
    }

    @GetMapping("/ping")
    public String ping() {
        System.out.println("PING HIT");
        return "pong";
    }
}