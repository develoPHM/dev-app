package com.example.k3s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HpaRunController {
    @GetMapping("/HpaRun")
    public String hpaRun() {
        System.out.println("HpaRun START");

        double x = Math.random();
        for (int i = 0; i < 1_000_000; i++) {
            x = Math.sqrt(x);
        }

        System.out.println("HpaRun END");
        return "HPA RUN OK";
    }

    @GetMapping("/ping")
    public String ping() {
        System.out.println("PING HIT");
        return "pong";
    }
}