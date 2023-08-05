package com.policySelection.repositories;

import com.policySelection.entities.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicySelectionRepo extends JpaRepository<Policy,String> {
}
