package com.policy;

import com.policy.entities.Policy;
import com.policy.repositories.PolicyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.UUID;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class PolicyServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PolicyServiceApplication.class, args);
	}

	@Autowired
	private PolicyRepo policyRepo;
	@Override
	public void run(String... args) throws Exception {
//		Policy p_1 = new Policy();
//		p_1.setPId(UUID.randomUUID().toString());
//		p_1.setAmount(10000);
//		p_1.setName("HDFC");
//		p_1.setType("Life Insurance");
//		policyRepo.save(p_1);
//
//		Policy p_2 = new Policy();
//		p_2.setPId(UUID.randomUUID().toString());
//		p_2.setName("LIC");
//		p_2.setType("Car Insurance");
//		p_2.setAmount(5000);
//		policyRepo.save(p_2);
//
//		Policy p_3 = new Policy();
//		p_3.setPId(UUID.randomUUID().toString());
//		p_3.setName("ICICI");
//		p_3.setType("Health Insurance");
//		p_3.setAmount(8000);
//		policyRepo.save(p_3);

	}
}
