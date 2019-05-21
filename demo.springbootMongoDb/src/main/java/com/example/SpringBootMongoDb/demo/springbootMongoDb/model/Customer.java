package com.example.SpringBootMongoDb.demo.springbootMongoDb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
 @Id
 String id;
 String firstName;
 String lastName;
 int age;
 
 public Customer(String firstName, String lastName, int age) {
	 this.firstName=firstName;
	this.lastName=lastName;
	this.age=age;
 }


public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


@Override
public String toString() {
	return "Customer [ First Name=" + firstName + ", Last Name=" + lastName + ", age=" + age + "]";
}
 

}
