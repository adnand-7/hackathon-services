package com.policy.controllers;

import com.policy.entities.Policy;
import com.policy.services.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class PolicyController {
    @Autowired
    private PolicyService policyService;
    @GetMapping("/policies")
    public ResponseEntity<List<Policy>> getAllPolicy(){
         List<Policy> policyList = this.policyService.getAllPolicy();
         return  new ResponseEntity<>(policyList, HttpStatus.OK) ;
    }
}
