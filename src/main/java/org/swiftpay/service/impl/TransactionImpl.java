package org.swiftpay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.swiftpay.dto.TransactionDto;
import org.swiftpay.entity.Transaction;
import org.swiftpay.repository.TransactionRepository;

public class TransactionImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
                .build();
        transactionRepository.save(transaction);
        System.out.println("transaction saved successfully");
    }
}
