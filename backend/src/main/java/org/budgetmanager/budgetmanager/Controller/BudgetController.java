package org.budgetmanager.budgetmanager.Controller;


import org.budgetmanager.budgetmanager.Entity.Budget;
import org.budgetmanager.budgetmanager.Repository.BudgetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BudgetController {

    private final BudgetRepository budgetRepository;

    public BudgetController(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    @PostMapping("/budget")
    public Budget saveBudget (@RequestBody  Budget budget) {
        return budgetRepository.save(budget);
    }


    @GetMapping("/budgets")
    public List<Budget> getBudgets() {
        return budgetRepository.findAll();
    }

    @DeleteMapping("/budget{id}")
    public void deleteBudget (@PathVariable Long id) {
        budgetRepository.deleteById(id);
    }

    @PutMapping("/budget{id}")
    public Budget updateBudget (@RequestBody Budget budget) {
        return budgetRepository.save(budget);
    }

}
