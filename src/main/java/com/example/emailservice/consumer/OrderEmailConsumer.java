package com.example.emailservice.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEmailConsumer {

    @RabbitListener(queues = "order-confirmation-queue")
    public void receiveMessage(String message) {

        System.out.println(message);
    }
}
