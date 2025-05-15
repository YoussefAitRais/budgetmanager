package org.budgetmanager.budgetmanager.Repository;
import  org.budgetmanager.budgetmanager.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TransactionRepository extends JpaRepository<Transaction,Long> {


}
