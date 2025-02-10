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
@Table(name="reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private User user;

    private int rating;

    @Column(columnDefinition = "TEXT")
    private String reviewText;

    @Column(updatable = false)
    private Instant reviewDate;
}
