package com.example.personalfinancemanagementapp.service;

import com.example.personalfinancemanagementapp.entity.Budget;
import com.example.personalfinancemanagementapp.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {
    @Autowired
    private BudgetRepository budgetRepository;

    public Budget save(Budget budget) {
        return budgetRepository.save(budget);
    }

    public List<Budget> findByUserId(Long userId) {
        return budgetRepository.findByUserId(userId);
    }
}
