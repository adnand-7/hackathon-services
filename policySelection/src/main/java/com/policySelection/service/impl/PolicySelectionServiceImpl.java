package com.policySelection.service.impl;

import com.policySelection.entities.Policy;
import com.policySelection.repositories.PolicySelectionRepo;
import com.policySelection.service.PolicySelectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PolicySelectionServiceImpl implements PolicySelectionService {
    @Autowired
    private PolicySelectionRepo policySelectionRepo;
    @Override
    public Policy getById(String pId) {
        return this.policySelectionRepo.findById(pId).get();
    }
}
