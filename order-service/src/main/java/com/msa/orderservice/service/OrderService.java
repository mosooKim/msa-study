package com.msa.orderservice.service;

import com.msa.orderservice.dto.OrderDto;
import com.msa.orderservice.jpa.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String userId);
    Iterable<OrderEntity> getOrderByUserId(String userId);
}

