package com.policyGeneration.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Transaction {
    private String transactionId;
    private boolean status;
    private String pId;

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", status=" + status +
                ", pId='" + pId + '\'' +
                '}';
    }
}
