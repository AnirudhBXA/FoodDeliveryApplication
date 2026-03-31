package com.example.FoodSearchingService.dtos;

import com.example.FoodSearchingService.entity.Restaurant;
import org.springframework.data.jpa.domain.Specification;

public class RestaurantSpecification {

    public static Specification<Restaurant> inLocation(String location) {
        return (root, query, cb) ->
                cb.equal(root.get("location"), location);
    }

    public static Specification<Restaurant> hasRating(double rating) {
        return (root, query, cb) ->
                cb.greaterThanOrEqualTo(root.get("rating"), rating);
    }

    public static Specification<Restaurant> isOpen() {
        return (root, query, cb) ->
                cb.isTrue(root.get("isOpen"));
    }

    public static Specification<Restaurant> hasCuisine(String cuisine) {
        return (root, query, cb) ->
                cb.equal(root.get("cuisineType"), cuisine);
    }

    public static Specification<Restaurant> minOrder(double amount) {
        return (root, query, cb) ->
                cb.lessThanOrEqualTo(root.get("minOrderAmount"), amount);
    }
}