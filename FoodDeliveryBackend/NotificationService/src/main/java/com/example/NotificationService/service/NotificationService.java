package com.example.NotificationService.service;

import com.example.NotificationService.dtos.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @KafkaListener(
            topics = "user-order",
            groupId = "order-group"
    )
    public void consume(OrderEvent event) {
        System.out.println("Received Order: " + event);
    }
}
