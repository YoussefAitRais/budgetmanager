package org.budgetmanager.budgetmanager.Mapper;


import jakarta.transaction.Transaction;
import org.budgetmanager.budgetmanager.DTO.TransactionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    @Mapping(source = "category.id", target = "categoryId")
    TransactionDTO toDTO(Transaction transaction);

    @Mapping(source = "categoryId", target = "category.id")
    Transaction toEntity(TransactionDTO transactionDTO);
}
