package com.Website.Gaditon.Repositories;

import com.Website.Gaditon.Enums.ProductCondition;
import com.Website.Gaditon.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findByProductCondition(ProductCondition productCondition);
}
