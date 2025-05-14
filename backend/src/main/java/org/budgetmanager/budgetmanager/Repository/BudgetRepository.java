package org.budgetmanager.budgetmanager.Repository;

import org.budgetmanager.budgetmanager.Entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface BudgetRepository extends JpaRepository<Budget, Long> {


}
