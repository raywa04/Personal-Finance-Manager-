package com.example.personalfinancemanagementapp.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String category;

    @NotNull
    private Double limit;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // getters and setters
}
