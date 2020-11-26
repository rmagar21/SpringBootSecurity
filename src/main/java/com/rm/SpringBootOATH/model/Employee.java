package com.rm.SpringBootOATH.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private Long id;
	private String name;
	private int age;
	private int amount;
	
	public Employee() {}
	
	public Employee(Long id, String name, int age, int amount) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", amount=" + amount + "]";
	}
		
}

