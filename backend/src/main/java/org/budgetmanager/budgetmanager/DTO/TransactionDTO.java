package org.budgetmanager.budgetmanager.DTO;

import org.budgetmanager.budgetmanager.Utils.TransactionType;

import java.time.LocalDateTime;

public class TransactionDTO {
    private Long id;
    private double montant;
    private String description;
    private LocalDateTime date;
    private TransactionType type;
    private Long categoryId;
}
