package com.rm.SpringBootOATH.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
//	public List<Student> findAll();
//	public Optional<Student> findById(Long id);
//	public Student saveStudent(Student student); 
}
