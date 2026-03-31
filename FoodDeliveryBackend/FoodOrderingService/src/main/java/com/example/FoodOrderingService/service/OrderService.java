package com.example.FoodOrderingService.service;

import com.example.FoodOrderingService.dtos.OrderEvent;
import com.example.FoodOrderingService.dtos.OrderRequest;
import com.example.FoodOrderingService.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    private KafkaTemplate<String, OrderEvent> kafkaTemplate;

    public void placeOrder() {

//        call the rest call for validation

//        OrderEvent orderEvent = OrderEvent.builder()
//                .orderId("anirudh")
//                .userId("anirudh")
//                .restaurantId("anirudh")
//                .amount(2343.23)
//                .build();
//        "anirudh", "anirudh", "anirudh", 2323.34
        OrderEvent orderEvent =  new OrderEvent();

        kafkaTemplate.send("user-order", orderEvent);

    }
}
