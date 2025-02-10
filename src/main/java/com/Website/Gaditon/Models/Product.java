package com.Website.Gaditon.Models;


import com.Website.Gaditon.Enums.ProductCondition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal price;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    private ProductCondition productCondition;

    private int stockQuantity;

    @ManyToOne
    @JoinColumn(name = "categories_id", nullable = false)
    private Category category;

    @Column(updatable = false)
    private Instant addedAt;
}
