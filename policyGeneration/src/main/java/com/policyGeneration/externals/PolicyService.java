package com.policyGeneration.externals;

import com.policyGeneration.entities.Policy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="POLICY-SELECTION-SERVICE")
public interface PolicyService {
    @GetMapping("/policie/select/{pId}")
    Policy getById(@PathVariable String pId);

}
