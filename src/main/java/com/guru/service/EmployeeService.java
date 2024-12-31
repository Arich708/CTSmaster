package com.guru.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guru.model.Employee;
import com.guru.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	public void store(Employee emp)
	{
		repo.save(emp);
	}

	public List<Employee> getAll()
	{
		return repo.findAll();
	}
	
	public void remove(int id)
	{
		repo.deleteById(id);
	}
}
