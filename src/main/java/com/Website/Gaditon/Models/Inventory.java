package com.Website.Gaditon.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "inventories")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    private int stockQuantity;

    private Instant lastUpdated;
}
