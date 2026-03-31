package com.example.FoodOrderingService.entity;

import com.example.FoodOrderingService.enums.OrderStatus;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "food_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userid;

    private Long restaurantid;
    private String restaurantname;

    private OrderStatus orderStatus;

    @OneToMany(mappedBy = "orderId")
    private List<OrderItem> orderedItems;

    private double totalprice;
}
