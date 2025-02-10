package com.Website.Gaditon.Repositories;

import com.Website.Gaditon.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findByUserId(Long userId);
}
