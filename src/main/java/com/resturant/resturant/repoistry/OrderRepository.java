package com.resturant.resturant.repoistry;

import com.resturant.resturant.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAll();
}