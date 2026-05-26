package com.example.emailservice.consumer;

import com.example.emailservice.dto.EmailOrderMessage;
import se.iths.maryam.messenger.service.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEmailConsumer {

    private final EmailService emailService;

    public OrderEmailConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "order-queue")
    public void receiveMessage(EmailOrderMessage message) {

        System.out.println("Received message from RabbitMQ");

        emailService.sendEmail(
                message.getEmail(),
                message.getMessage()
        );
    }
}