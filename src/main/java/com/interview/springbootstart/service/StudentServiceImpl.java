package com.interview.springbootstart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.interview.springbootstart.model.Student;
import com.interview.springbootstart.repository.Repository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private Repository repository;

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	@Override
	public Student getStudentById(int studentId) {
		return repository.findById(studentId).get();
	}

	@Override
	public Student saveStudentDetails(Student student) {
		return repository.save(student);
	}

	@Override
	public void deleteStudentById(int studentId) {
		repository.deleteById(studentId);

	}

}
