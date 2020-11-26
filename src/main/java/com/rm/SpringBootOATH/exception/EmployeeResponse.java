package com.rm.SpringBootOATH.exception;

import com.rm.SpringBootOATH.model.Employee;

public class EmployeeResponse {
	private Employee employee;
    private String message;
	
    public EmployeeResponse(Employee employee, String message) {
		super();
		this.employee = employee;
		this.message = message;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}   
    
}
