package com.example.FoodOrderingService.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEvent {

    private String orderId;
    private String userId;
    private String restaurantId;
    private double amount;
}
