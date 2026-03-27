package com.example.FoodSearchingService.controller;

import com.example.FoodSearchingService.dtos.RestaurantDetailsDTO;
import com.example.FoodSearchingService.dtos.RestaurantSummaryDTO;
import com.example.FoodSearchingService.service.RestaurantService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    // Get restaurant list (for homepage)
    @GetMapping
    public List<RestaurantSummaryDTO> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    // Get restaurant details (menu page)
    @GetMapping("/{id}")
    public RestaurantDetailsDTO getRestaurantDetails(@PathVariable Long id) {
        return restaurantService.getRestaurantDetails(id);
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}