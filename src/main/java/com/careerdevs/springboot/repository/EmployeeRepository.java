package com.careerdevs.springboot.repository;

import com.careerdevs.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // this will get alll CRUD database methods
}
