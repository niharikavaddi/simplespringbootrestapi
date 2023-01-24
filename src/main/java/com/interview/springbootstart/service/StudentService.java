package com.interview.springbootstart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.interview.springbootstart.model.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public Student getStudentById(int studentId);

	public Student saveStudentDetails(Student student);

	public void deleteStudentById(int studentId);

}
