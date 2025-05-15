package org.budgetmanager.budgetmanager.Entity;

import jakarta.persistence.*;
import org.budgetmanager.budgetmanager.Utils.TransactionType;

import java.time.LocalDateTime;

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double montant;

    private String description;

    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    private TransactionType type;




    }


