package com.example.FoodSearchingService.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantDetailsDTO {
    private Long id;
    private String name;
    private double rating;
    private String location;
    private int deliveryTime;
    private double deliveryFee;
    private boolean isOpen;

    private List<FoodDTO> menu;
}
