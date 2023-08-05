package com.policy.services.impl;


import com.policy.entities.Policy;
import com.policy.repositories.PolicyRepo;
import com.policy.services.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService {
    @Autowired
    private PolicyRepo policyRepo;
    @Override
    public List<Policy> getAllPolicy() {
        return this.policyRepo.findAll();
    }
}
