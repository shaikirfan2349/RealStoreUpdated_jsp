package com.example.Real_Store.service;

import com.example.Real_Store.entity.Booking;
import com.example.Real_Store.entity.Cart;
import com.example.Real_Store.entity.Payment;
import com.example.Real_Store.entity.Product;

import java.util.List;
import java.util.Map;

public interface OrderService {
    Map<String,Object> calculateTotalAmount(List<Cart> cartList, Long userId);

    void updatePayment_OrderStatus(Booking booking, Long userId);

    Booking getOrderById(Long orderId);
//    List<Double> placeOrder(List<Product> viewFinalProductList);
}
