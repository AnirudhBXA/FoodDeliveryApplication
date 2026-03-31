package com.example.FoodSearchingService.repository;

import com.example.FoodSearchingService.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FoodRepository extends JpaRepository<Food, Long>,
        JpaSpecificationExecutor<Food> {
}
