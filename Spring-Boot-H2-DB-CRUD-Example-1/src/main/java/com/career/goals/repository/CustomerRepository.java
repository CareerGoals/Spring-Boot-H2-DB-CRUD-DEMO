package com.career.goals.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.career.goals.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	List<Customer> getByCustName(String custName);

	List<Customer> getByCustId(Integer custId);
	
	List<Customer> getByAccountNum(String accountNum);

}
