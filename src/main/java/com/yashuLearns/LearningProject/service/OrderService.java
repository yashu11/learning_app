package com.yashuLearns.LearningProject.service;

import com.yashuLearns.LearningProject.dao.OrderDetailsRepo;
import com.yashuLearns.LearningProject.model.OrderDetails;
import com.yashuLearns.LearningProject.model.OrderDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderDetailsRepo orderDetailsRepo;

    public void insertOrder(OrderDto orderDto)
    {
        ModelMapper modelMapper = new ModelMapper();
        OrderDetails orderDetails=modelMapper.map(orderDto,OrderDetails.class);
        orderDetailsRepo.save(orderDetails);
    }
}
