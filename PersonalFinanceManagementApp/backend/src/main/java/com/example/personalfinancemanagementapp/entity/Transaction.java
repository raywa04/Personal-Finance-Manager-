package com.example.personalfinancemanagementapp.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Double amount;

    @NotNull
    private String description;

    @NotNull
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // getters and setters
}
