package com.policyGeneration.repositories;

import com.policyGeneration.entities.PolicyGeneration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyGenerationRepo extends JpaRepository<PolicyGeneration,String> {
}
