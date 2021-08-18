package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Demo")
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping("/EmpDeatails/{id}")
	public List<Employee> getEmpDetails(@PathVariable(value = "id") String id) {
		List<Employee> empDetail = demoService.employeeDeatils(id);
		return empDetail;
	}
}
