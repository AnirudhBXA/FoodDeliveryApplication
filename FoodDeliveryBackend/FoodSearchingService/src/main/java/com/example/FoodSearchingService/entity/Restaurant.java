package com.example.FoodSearchingService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String location;

    private double rating;

    private boolean isOpen;

    private String cuisineType;

    private double minOrderAmount;

    private String contactNumber;

    private String imageUrl;

    @OneToMany(mappedBy = "restaurant")
    private List<Food> menu;

}