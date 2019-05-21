package com.example.SpringBootMongoDb.demo.springbootMongoDb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootMongoDb.demo.springbootMongoDb.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
 public Customer findByFirstName(String firstName);
 public List<Customer> findByAge(int age);
}
