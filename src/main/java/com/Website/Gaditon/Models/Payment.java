package com.Website.Gaditon.Models;

import com.Website.Gaditon.Enums.PaymentMethod;
import com.Website.Gaditon.Enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "orders_id", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    private BigDecimal amountPaid;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Column(updatable = false)
    private Instant transactionDate;

}
