package org.budgetmanager.budgetmanager.Controller;

import org.budgetmanager.budgetmanager.Entity.Budget;
import org.budgetmanager.budgetmanager.Repository.BudgetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budget")
public class BudgetController {

    private final BudgetRepository budgetRepository;

    public BudgetController(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    // CREATE
    @PostMapping("/api/budget")
    public Budget createBudget(@RequestBody Budget budget) {
        return budgetRepository.save(budget);
    }

    // READ ALL
    @GetMapping("/api/budget")
    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    // UPDATE
    @PutMapping("/api/budget/{id}")
    public Budget updateBudget(@PathVariable Long id, @RequestBody Budget updatedBudget) {
        updatedBudget.setId(id);
        return budgetRepository.save(updatedBudget);
    }

    // DELETE
    @DeleteMapping("/api/budget/{id}")
    public void deleteBudget(@PathVariable Long id) {
        budgetRepository.deleteById(id);
    }
}
