package com.pack.repository;

import org.springframework.data.repository.CrudRepository;

import com.pack.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

	/* void update(Employee employee); */

	
}
