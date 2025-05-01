package com.resturant.resturant.services;

import com.resturant.resturant.entites.Order;
import com.resturant.resturant.entites.Product;
import com.resturant.resturant.repoistry.OrderRepository;
import com.resturant.resturant.repoistry.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private ProductRepository productRepository;

    public Order createOrder(Order order, Set<Long> productIds) {
        Set<Product> products = new HashSet<>(productRepository.findAllById(productIds));
        order.setProducts(products);
        order.setOrderDate(LocalDateTime.now());
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}