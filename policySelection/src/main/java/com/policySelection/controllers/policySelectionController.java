package com.policySelection.controllers;

import com.policySelection.entities.Policy;
import com.policySelection.service.PolicySelectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class policySelectionController {
    @Autowired
    private PolicySelectionService policySelectionService;
    @GetMapping("/policie/select/{pId}")
    public ResponseEntity<Policy> getById(@PathVariable String pId){
        Policy p = this.policySelectionService.getById(pId);
        return new ResponseEntity<>(p,HttpStatus.OK);
    }


}
