package com.example.FoodSearchingService.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantSummaryDTO {

    private Long id;
    private String name;
    private double rating;
    private String location;
    private int deliveryTime;
    private String imageUrl;
    private boolean isOpen;

}