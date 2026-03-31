package com.example.FoodSearchingService.repository;

import com.example.FoodSearchingService.entity.Food;
import com.example.FoodSearchingService.entity.Restaurant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>,
        JpaSpecificationExecutor<Restaurant> {


    Optional<Restaurant> findById(Long id);


}
