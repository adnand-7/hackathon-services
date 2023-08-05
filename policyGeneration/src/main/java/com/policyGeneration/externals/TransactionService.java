package com.policyGeneration.externals;

import com.policyGeneration.entities.Transaction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="TRANSACTION-SERVICE")
public interface TransactionService {
    @GetMapping("/getById/{transactionId}")
    Transaction getById(@PathVariable String transactionId);

}
