package com.rm.SpringBootOATH.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rm.SpringBootOATH.model.Employee;
import com.rm.SpringBootOATH.model.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	public List<Employee> findAll(){
		return employeeRepo.findAll();
    	
    }
    
	public Optional<Employee> findById(Long id) {
		return employeeRepo.findById(id);
    	
    }
	
	 
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
    	
    }
	
	public void deleteEmployee(Long id) {
		  employeeRepo.deleteById(id);
	}

}
