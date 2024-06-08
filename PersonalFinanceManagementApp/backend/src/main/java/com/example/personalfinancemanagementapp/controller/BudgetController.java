package com.example.personalfinancemanagementapp.controller;

import com.example.personalfinancemanagementapp.entity.Budget;
import com.example.personalfinancemanagementapp.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budgets")
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @PostMapping
    public Budget createBudget(@RequestBody Budget budget) {
        return budgetService.save(budget);
    }

    @GetMapping("/user/{userId}")
    public List<Budget> getBudgetsByUserId(@PathVariable Long userId) {
        return budgetService.findByUserId(userId);
    }
}
