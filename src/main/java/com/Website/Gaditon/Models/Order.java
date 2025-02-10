package com.Website.Gaditon.Models;


import com.Website.Gaditon.Enums.OrderStatus;
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
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private BigDecimal totalAmount;

    @Column(updatable = false)
    private Instant orderDate;
}
