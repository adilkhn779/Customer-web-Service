package com.example.SpringBootMongoDb.demo.springbootMongoDb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootMongoDb.demo.springbootMongoDb.Service.CustomerService;
import com.example.SpringBootMongoDb.demo.springbootMongoDb.model.Customer;

@RestController
public class CustomerController {
     @Autowired
	private CustomerService customerService;
     @RequestMapping("/create")
     public String create(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age) {
    Customer c =customerService.create(firstName, lastName, age);
    return c.toString();
     }
     @RequestMapping("/get")
     public Customer getCustomer(@RequestParam String firstName) {
    	 return customerService.getByFirstName(firstName);
     }
     @RequestMapping("/getAll")
     public List<Customer> getAll(){
    	 return customerService.getAll();
     }
     @RequestMapping("/update")
     public String update(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age) {
    	    Customer c =customerService.create(firstName, lastName, age);
    	    return c.toString();
    	     }
     @RequestMapping("/delete")
     public String delete(@RequestParam String firstName) {
    	 customerService.delete(firstName);
    	 return "Deleted" + firstName;
     }
     @RequestMapping("/deleteAll")
     public String deleteAll() {
    	 customerService.deleteAll();
    	 return "Deleted All records";
     }
}

