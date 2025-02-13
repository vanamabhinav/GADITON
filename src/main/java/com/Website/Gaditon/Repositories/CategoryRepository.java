package com.Website.Gaditon.Repositories;

import com.Website.Gaditon.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Optional<Category> findByCategoryName(String categoryName);
}
