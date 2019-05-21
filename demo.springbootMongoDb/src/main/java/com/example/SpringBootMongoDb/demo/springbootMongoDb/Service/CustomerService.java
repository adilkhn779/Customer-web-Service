package com.example.SpringBootMongoDb.demo.springbootMongoDb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootMongoDb.demo.springbootMongoDb.model.Customer;
import com.example.SpringBootMongoDb.demo.springbootMongoDb.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
	private CustomerRepository customerRepository;
    
    //create Operation
    public Customer create(String firstName, String lastName, int age) {
    	return customerRepository.save(new Customer(firstName,lastName,age));
    }
    
    //retrieve operation
    public List<Customer> getAll(){
    	return customerRepository.findAll();
    }
    public Customer getByFirstName( String firstName) {
    	return customerRepository.findByFirstName(firstName);
    }
    //update operation
    public Customer update(String firstName, String lastName, int age) {
    	Customer c = customerRepository.findByFirstName(firstName);
    	c.setLastName(lastName);
    	c.setAge(age);
    	return customerRepository.save(c);
    }
    //delete operation
    public void deleteAll() {
    	customerRepository.deleteAll();
    }
    public void delete(String firstName) {
    	Customer c =customerRepository.findByFirstName(firstName);
    	customerRepository.delete(c);
    }
}
