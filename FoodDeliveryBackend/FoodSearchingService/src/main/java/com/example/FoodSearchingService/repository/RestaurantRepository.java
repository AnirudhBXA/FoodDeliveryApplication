package com.example.FoodSearchingService.repository;

import com.example.FoodSearchingService.entity.Food;
import com.example.FoodSearchingService.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    List<Restaurant> findAll();

    Optional<Restaurant> findById(Long id);



}
