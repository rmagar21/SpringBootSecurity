package com.rm.SpringBootOATH;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import com.rm.SpringBootOATH.model.Employee;
import com.rm.SpringBootOATH.model.EmployeeRepository;

@SpringBootApplication
public class SpringBootOathApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOathApplication.class, args);
	}
	
	@Component
	class StudentCommandLineRunner implements CommandLineRunner{
		@SuppressWarnings("unused")
		private final EmployeeRepository employeeRepository;
		
		public StudentCommandLineRunner(EmployeeRepository employeeRepository) {
			this.employeeRepository = employeeRepository;
		}

		@Override
		public void run(String... args) throws Exception {
			List<Employee> employeeList = new ArrayList<>();
	        employeeList.add(new Employee(11l, "Roshan", 35, 85000));
			employeeList.add(new Employee(12l, "Ram", 33, 75000));
			employeeList.add(new Employee(15l, "Deepak", 34, 25000));
			employeeList.add(new Employee(13l, "Sonam", 36, 65000));
			
			employeeRepository.saveAll(employeeList);
			System.out.println("Hello World");
		}
		
	}

}
