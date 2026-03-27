package com.example.FoodSearchingService.entity;

import com.example.FoodSearchingService.enums.FoodCategory;
import com.example.FoodSearchingService.enums.FoodType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double price;

    private String description;

    private FoodType foodType;

    private FoodCategory foodCategory;

    private boolean available;

    private String imageUrl;

    private int preparationTime;

    private double rating;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

}