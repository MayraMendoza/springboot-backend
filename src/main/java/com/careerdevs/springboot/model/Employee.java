package com.careerdevs.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

//@Getter //TO CREATE A GETTER METHOD FOR THESE PRIVATE FIELDS
//@Setter // To create a setter method for these private fields
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
