package com.policyGeneration.service.impl;

import com.policyGeneration.entities.Policy;
import com.policyGeneration.entities.PolicyGeneration;
import com.policyGeneration.entities.Transaction;
import com.policyGeneration.externals.PolicyService;
import com.policyGeneration.externals.TransactionService;
import com.policyGeneration.repositories.PolicyGenerationRepo;
import com.policyGeneration.service.PolicyGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

@Service
public class PolicyGenerationServiceImpl implements PolicyGenerationService {
    String pattern = "dd/MM/yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    @Autowired
    private PolicyGenerationRepo policyGenerationRepo;

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private PolicyService policyService;
    @Override
    public PolicyGeneration createPolicyDocument(String transactionId) {

        Transaction transactionDetails = this.transactionService.getById(transactionId);
        System.out.println(transactionDetails.toString());
        System.out.println(transactionDetails.getTransactionId()+" -- "+ transactionDetails.getPId());
        //getPolicyDetails
        String pId = transactionDetails.getPId();
        System.out.println("Inside" + pId);
        Policy policyDetail = this.policyService.getById(pId);
        System.out.println(policyDetail.getName());
        PolicyGeneration pG = new PolicyGeneration();
        pG.setPolicyType(policyDetail.getType());
        pG.setPolicyName(policyDetail.getName());
        pG.setTransactionId(transactionDetails.getTransactionId());
        String date = simpleDateFormat.format(new Date());
        pG.setStartDate(date);

        Date today = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, 360);
        Date d =cal.getTime();
        String date_end = simpleDateFormat.format(d);
        pG.setEndDate(date_end);
        pG.setPolicyGenerationId(UUID.randomUUID().toString());
        this.policyGenerationRepo.save(pG);
        //save into database_ _ _ _
        return pG;
    }
}
