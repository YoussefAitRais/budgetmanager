package org.budgetmanager.budgetmanager.Controller;




import lombok.RequiredArgsConstructor;
import  org.budgetmanager.budgetmanager.Entity.*;
import org.budgetmanager.budgetmanager.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {
    @Autowired
    private TransactionService transaction;


    @PostMapping
    public Transaction ajouter(@RequestBody Transaction t) {
        return transaction.ajouterTransaction(t);
    }

    @GetMapping
    public List<Transaction> listerTransactions() {
        return transaction.listerTransactions();
    }

    @GetMapping("/{id}")
    public Transaction getById(@PathVariable Long id) {
        return transaction.getTransactionById(id)
                .orElse(null);
    }

    @PutMapping("/{id}")
    public Transaction modifier(@PathVariable Long id, @RequestBody Transaction t) {
        return transaction.modifierTransaction(id, t);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        transaction.supprimerTransaction(id);
    }
}
