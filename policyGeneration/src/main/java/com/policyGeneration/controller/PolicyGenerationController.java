package com.policyGeneration.controller;

import com.policyGeneration.entities.PolicyGeneration;
import com.policyGeneration.service.PolicyGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class PolicyGenerationController {
    @Autowired
    private PolicyGenerationService policyGenerationService;
    @PostMapping("/policy/generate/{transactionId}")
    public ResponseEntity<PolicyGeneration> generarePolicyDocumnet(@PathVariable String transactionId){
        PolicyGeneration dataSaved =this.policyGenerationService.createPolicyDocument(transactionId);
        return new ResponseEntity<>(dataSaved, HttpStatus.OK);
    }
}
