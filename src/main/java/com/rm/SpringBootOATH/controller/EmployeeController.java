package com.rm.SpringBootOATH.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rm.SpringBootOATH.model.Employee;
import com.rm.SpringBootOATH.service.EmployeeService;

@RestController
//@BasePathAwareController (imported if versioning is not managed by spring data)
@RequestMapping("api/v1")
public class EmployeeController {

    @Autowired
	private EmployeeService employeeService;

	
	@GetMapping("/display")
	public ModelAndView showDisplay(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		return mv;
	}
	

	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee){
         return employeeService.saveEmployee(employee);		
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
	    return employeeService.findAll();
		
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeWithId(@PathVariable(value = "id") Long employeeId){
	    return employeeService.findById(employeeId);	
	}
	
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Employee> deleteEmployeeById(@PathVariable Long id){
		if(!employeeService.findById(id).isPresent()) {
			System.out.println("Student with studentid %d, not found" + id);
		}
	    employeeService.deleteEmployee(id);
	    return ResponseEntity.ok().build();
	}

}
