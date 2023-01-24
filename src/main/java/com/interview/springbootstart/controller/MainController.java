package com.interview.springbootstart.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.interview.springbootstart.model.Student;
import com.interview.springbootstart.service.StudentService;

@RestController
public class MainController {

	@Autowired
	private StudentService service;

	@RequestMapping("/hello")
	public String fromController() {
		return "Hello World";
	}

	@GetMapping("/getallstudents")
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}

	@GetMapping("/getstudentbyid/{id}")
	public Student getStudentById(@PathVariable("id") int studentId) {
		return service.getStudentById(studentId);
	}

	@PostMapping("/savestudentdetails")
	public Student saveStudentDetails(@RequestBody Student student) {
		return service.saveStudentDetails(student);
	}

	@DeleteMapping("/deletestudentbyid/{id}")
	public Student deleteStudentDetails(@PathVariable("id") int studentId) {
		return service.getStudentById(studentId);
	}

}