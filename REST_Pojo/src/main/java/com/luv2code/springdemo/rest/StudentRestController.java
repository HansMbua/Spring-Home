package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.PostConstruct;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	// define @PostConstruct to load the Student data..... only once


	@PersistenceContext
	public void loadData(){
		List<Student> theStudents = new ArrayList<>();

		theStudents.add(new Student("Poornima", "Patel"));
		theStudents.add(new Student("Mario", "Rossi"));
		theStudents.add(new Student("Mary", "Smith"));

	}



	// define endpoint for "/students" - return list of student
	@GetMapping("/students")
	public List<Student> getStudents() {


		return theStudents;
	}
	
}








