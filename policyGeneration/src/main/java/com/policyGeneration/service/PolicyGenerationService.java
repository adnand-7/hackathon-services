package com.policyGeneration.service;

import com.policyGeneration.entities.PolicyGeneration;

public interface PolicyGenerationService {
    PolicyGeneration createPolicyDocument(String transactionId);
}
