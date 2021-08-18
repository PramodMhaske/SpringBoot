package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public List<Employee> employeeDeatils(String id){
		Employee e = new Employee();
		e.setEmpName("Pramod");
		e.setAge(29);
		
		Employee e1 = new Employee();
		e1.setEmpName("Sagar");
		e1.setAge(30);
		
		List<Employee> al = new ArrayList<Employee>();
		al.add(e);
		al.add(e1);
		
		return al;
	}
}
