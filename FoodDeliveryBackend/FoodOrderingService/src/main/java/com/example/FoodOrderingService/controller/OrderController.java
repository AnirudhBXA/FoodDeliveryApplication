package com.example.FoodOrderingService.controller;

import com.example.FoodOrderingService.dtos.OrderRequest;
import com.example.FoodOrderingService.dtos.UserOrderResponse;
import com.example.FoodOrderingService.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;


    @GetMapping("/me")
    public ResponseEntity<List<UserOrderResponse>> me() {

        return ResponseEntity.ok().body(null);
    }

    @PostMapping("/placeOrder")
    public ResponseEntity<?> placeOrder(@RequestBody OrderRequest orderRequest) {

        orderService.placeOrder();
        return ResponseEntity.ok().body(null);
    }


}
