package com.example.demo.service;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import com.example.demo.dto.Student;

public interface StudentService {

	public List<Student> selectAll();

	public boolean addStudent(Student student);

	public boolean updateStudent(Student body);

}
