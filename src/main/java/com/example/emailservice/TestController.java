package com.example.emailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@RestController
public class TestController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/send-test")
    public String sendTest() {
        rabbitTemplate.convertAndSend("order-queue", "Hello from email-service!");
        return "Message sent!";
    }
}