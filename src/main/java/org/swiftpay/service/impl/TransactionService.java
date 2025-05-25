package org.swiftpay.service.impl;

import org.swiftpay.dto.TransactionDto;
import org.swiftpay.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
