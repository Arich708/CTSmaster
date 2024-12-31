package com.guru.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.guru.model.Employee;
import com.guru.service.EmployeeService;

@RestController
public class Demo {
	
	@Autowired
	private Employee emp;

	@Autowired
	private EmployeeService service;
	
	@GetMapping("home")
	public List<Employee> view()
	{
		return service.getAll();
	}
	
	@PostMapping("home")
	public String view2(@RequestBody Employee emp)
	{
		service.store(emp);
		return "insert the records";
	}
	
	@PutMapping("home")
	public String view3(@RequestBody Employee emp)
	{
		service.store(emp);
		return "Modify the records";
	}
	
	@DeleteMapping("home/{id}")
	public String view4(@PathVariable("id")int id)
	{
		service.remove(id);
		return "Delete the records";
	}
}
