package com.example.FoodSearchingService.service;

import com.example.FoodSearchingService.dtos.FoodDTO;
import com.example.FoodSearchingService.dtos.RestaurantDetailsDTO;
import com.example.FoodSearchingService.dtos.RestaurantSummaryDTO;
import com.example.FoodSearchingService.entity.Restaurant;
import com.example.FoodSearchingService.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;


    // Get all restaurants (summary)
    public List<RestaurantSummaryDTO> getAllRestaurants() {
        return restaurantRepository.findAll()
                .stream()
                .map(r -> {

                    return RestaurantSummaryDTO.builder()
                            .id(r.getId())
                            .name(r.getName())
                            .location(r.getLocation())
                            .rating(r.getRating())
                            .build();
                })
                .collect(Collectors.toList());
    }

    // Get full restaurant details
    public RestaurantDetailsDTO getRestaurantDetails(Long id) {

        Restaurant r = restaurantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Restaurant not found"));

        List<FoodDTO> foodList = r.getMenu()
                .stream()
                .map(f -> {
                    return FoodDTO.builder()
                            .id(f.getId())
                            .name(f.getName())
                            .build();
                })
                .collect(Collectors.toList());

        return RestaurantDetailsDTO.builder()
                .id(r.getId())
                .name(r.getName())
                .location(r.getLocation())
                .build();
    }
}