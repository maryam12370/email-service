package com.example.emailservice;

import com.example.emailservice.dto.EmailOrderMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/send-test")
    public String sendTest() {

        EmailOrderMessage message =
                new EmailOrderMessage(
                        "maryamselemankhil786@gmail.com",
                        "Your order was successful!"
                );

        rabbitTemplate.convertAndSend("order-queue", message);

        return "Message sent!";
    }
}