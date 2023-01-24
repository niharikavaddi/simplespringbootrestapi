package com.interview.springbootstart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interview.springbootstart.model.Student;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student, Integer> {

}
