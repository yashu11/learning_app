package com.yashuLearns.LearningProject.dao;

import com.yashuLearns.LearningProject.model.OrderDetails;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailsRepo extends CrudRepository<OrderDetails,String> {
}
