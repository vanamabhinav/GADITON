package com.Website.Gaditon.Repositories;

import com.Website.Gaditon.Models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    Optional<Inventory> findByProductId(Long productId);
}
