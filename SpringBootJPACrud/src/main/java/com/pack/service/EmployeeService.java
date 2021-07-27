package com.pack.service;

import java.util.*;
import com.pack.model.*;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	 
	 public Employee getEmployeeById(int id);
	 
	 public void saveOrUpdate(Employee employee);
	 
	 public void delete(int id);

}
