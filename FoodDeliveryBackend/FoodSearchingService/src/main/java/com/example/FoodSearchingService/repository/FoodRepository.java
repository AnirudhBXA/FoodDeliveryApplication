package com.example.FoodSearchingService.repository;

import com.example.FoodSearchingService.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
