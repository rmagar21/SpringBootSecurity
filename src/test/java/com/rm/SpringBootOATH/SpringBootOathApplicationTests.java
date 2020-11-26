package com.rm.SpringBootOATH;

import static org.mockito.Mockito.doReturn;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.rm.SpringBootOATH.model.Employee;
import com.rm.SpringBootOATH.model.EmployeeRepository;
import com.rm.SpringBootOATH.service.EmployeeService;


@SpringBootTest
class SpringBootOathApplicationTests {

	@Autowired
	private EmployeeService employeeService;

	@MockBean
	private EmployeeRepository employeeRepository;

	@Test
	@DisplayName("Test findById Success")
	public void getStudentById() {
		// Set up mock repository
		Employee student = new Employee(11L, "Roshan", 33, 85000);
		doReturn(Optional.of(student)).when(employeeRepository).findById(11L);

		// Execute the service call
		Optional<Employee> returnStudent = employeeService.findById(11L);

		// Assert the response
		Assertions.assertTrue(returnStudent.isPresent(), "Student was not found");
		Assertions.assertSame(returnStudent.get(), student, "The Student returned was not the same as the mock");

	}

	@Test
	@DisplayName("Test findById Not Found")
	void testFindByIdNotFound() {
		// Setup our mock repository
		doReturn(Optional.empty()).when(employeeRepository).findById(1l);

		// Execute the service call
		Optional<Employee> returnStudent = employeeService.findById(1l);

		// Assert the response
		Assertions.assertFalse(returnStudent.isPresent(), "Student should not be found");
	}
	
	@Test
    @DisplayName("Test findAll")
    void testFindAll() {
        // Setup our mock repository
		Employee student1 = new Employee(11L, "Roshan", 33, 85000);
		Employee student2 = new Employee(15L, "Jashi", 33, 75000);
        doReturn(Arrays.asList(student1, student2)).when(employeeRepository).findAll();

        // Execute the service call
        List<Employee> students = employeeService.findAll();

        // Assert the response
        Assertions.assertEquals(2, students.size(), "findAll should return 2 students");
    }

}
