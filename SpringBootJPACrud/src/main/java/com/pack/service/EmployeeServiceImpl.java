package com.pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.model.Employee;
import com.pack.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
 
 @Autowired
 EmployeeRepository employeeRepository;

 @Override
 public List<Employee> getAllEmployees() {
  return (List<Employee>) employeeRepository.findAll();
 }

 @Override
 public Employee getEmployeeById(int id) {
  return employeeRepository.findById(id).get();
 }

 @Override
 public void saveOrUpdate(Employee employee) {
  employeeRepository.save(employee);
 }

 @Override
 public void delete(int id) {
  employeeRepository.deleteById(id);
 }

}