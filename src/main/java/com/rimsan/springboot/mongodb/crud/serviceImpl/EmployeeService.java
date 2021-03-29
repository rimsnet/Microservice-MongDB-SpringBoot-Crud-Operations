package com.rimsan.springboot.mongodb.crud.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimsan.springboot.mongodb.crud.documents.Employee;
import com.rimsan.springboot.mongodb.crud.repo.EmployeeRepository;
import com.rimsan.springboot.mongodb.crud.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	

	@Override
	public void saveEmployee(Employee employee) {

		employeeRepository.save(employee);

	}

	@Override
	public void updateEmployee(Employee employee) {

		employeeRepository.save(employee);
	}
	
	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> empList = null;
		empList = employeeRepository.findAll();
		return empList;
	}

	@Override
	public void deleteEmployee(String employeeId) {
		employeeRepository.deleteById(employeeId);
	}

}
