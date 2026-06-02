package com.example.emailservice.consumer;

import com.example.emailservice.dto.EmailOrderMessage;
import com.example.emailservice.dto.OrderItemMessage;
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
    public void receiveMessage(OrderItemMessage message) {

        System.out.println("Received message from RabbitMQ");
        System.out.println(message.getItems());
        System.out.println(message.getCustomerName());

//        emailService.sendEmail(
//                message.getEmail(),
//                message.getMessage()
//        );
    }
}