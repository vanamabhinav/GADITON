package com.Website.Gaditon.Models;

import com.Website.Gaditon.Enums.UserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String passwordHash;
    private String phoneNumber;
    private String address;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @Column(updatable = false)
    private Instant createdAt;}
