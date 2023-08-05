package com.transactionService.service.impl;

import com.transactionService.entities.Transaction;
import com.transactionService.repositories.TransactionRepo;
import com.transactionService.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepo transactionRepo;
    @Override
    public Transaction makePayment(String pId) {


        Transaction transactionResult = new Transaction();
        transactionResult.setTransactionId(UUID.randomUUID().toString());
        transactionResult.setStatus(true);
        transactionResult.setPId(pId);
        transactionRepo.save(transactionResult);
        return transactionResult;
    }

    @Override
    public Transaction getById(String transactionId) {
        return this.transactionRepo.findById(transactionId).get();
    }
}
