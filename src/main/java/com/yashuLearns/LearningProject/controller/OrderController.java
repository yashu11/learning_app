package com.yashuLearns.LearningProject.controller;

import com.yashuLearns.LearningProject.model.OrderDto;
import com.yashuLearns.LearningProject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping(value = "/insertOrder")
    public void insertOrder(@RequestBody OrderDto orderDto) {
        orderService.insertOrder(orderDto);
    }
}
