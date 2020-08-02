package com.yashuLearns.LearningProject.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="OrderDetails")
public class OrderDetails {

    @Id
    @Column(name="orderId")
    @GenericGenerator(name="order_id_gen",strategy = "com.yashuLearns.LearningProject.generators.OrderIdGenerator")
    @GeneratedValue(generator = "order_id_gen")
    private String orderId;
    @Column(name="orderBy")
    private String orderBy;
    @Column(name="orderPlacedOn")
    private LocalDateTime orderPlacedOn;
}
