package com.career.goals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.career.goals.model.Customer;
import com.career.goals.repository.CustomerRepository;

@RestController
public class CustmerController {
	
	@Autowired
	private CustomerRepository repository;
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@RequestBody Customer customer) {
		System.out.println("hiiiiiii");
		repository.save(customer);
		
		return "Customer record saves successfully";
	}
	
	@GetMapping("/getCustomers")
	public List<Customer> getCustomerdeatisl(){
		return repository.findAll();
	}
	
	@GetMapping("/getCustomer/{custname}")
	public List<Customer> getCustomeByCustName(@PathVariable String custname){
		return repository.getByCustName(custname);
	}
	
	@GetMapping("/getCustomerById/{custid}")
	public List<Customer> getCustomeByCustId(@PathVariable Integer custid){
		return repository.getByCustId(custid);
	}

}
