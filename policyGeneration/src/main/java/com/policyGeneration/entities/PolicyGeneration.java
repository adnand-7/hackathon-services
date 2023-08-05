package com.policyGeneration.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PolicyGeneration {
    @Id
    private String policyGenerationId;

    private String policyName;
    private String policyType;
    private String startDate;
    private String endDate;
    private String TransactionId;
}
