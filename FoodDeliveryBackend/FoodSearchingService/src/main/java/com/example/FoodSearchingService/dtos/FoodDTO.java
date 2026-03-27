package com.example.FoodSearchingService.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodDTO {

    private Long id;
    private String name;
    private double price;
    private String description;
    private boolean available;
    private String imageUrl;
    private String category;
    private String type;
}
