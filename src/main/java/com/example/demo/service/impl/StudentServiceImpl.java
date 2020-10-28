package com.example.demo.service.impl;

import java.text.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.dao.studentMapper;
import com.example.demo.dto.Student;
import com.example.demo.pojo.student;
@Service
public class StudentServiceImpl implements com.example.demo.service.StudentService {
	@Resource
	public studentMapper studentMapper;
	SimpleDateFormat sdf =   new SimpleDateFormat("yyyy");
	@Override
	public List<Student> selectAll(){
		List<student> dbList=studentMapper.selectAll();
		List<Student> studentList = new ArrayList<Student>();
		for (int i = 0; i < dbList.size(); i++) {
			Student stu = new Student();
			stu.setStuId(dbList.get(i).getId());
			stu.setAddress(dbList.get(i).getAddress());		
			stu.setBirth(sdf.format(dbList.get(i).getBirth()));
			stu.setDepartment(dbList.get(i).getDepartment());
			stu.setSex(dbList.get(i).getSex());
			stu.setStuName(dbList.get(i).getName());
			studentList.add(stu);
		}
		return studentList;
	}
	
	@Override
	public boolean addStudent(Student student){
		student stu = new student();
		if (student.getStuName() == null || student.getStuId() == null) {
			return false;
		}
		stu.setAddress(student.getAddress());
		Date date;
		try {
			date = sdf.parse(student.getBirth());stu.setBirth(date);;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		stu.setDepartment(student.getDepartment());
		stu.setId(student.getStuId());
		stu.setName(student.getStuName());
		stu.setSex(student.getSex());
		studentMapper.insert(stu);
		return true;
	}
	
	@Override
	public boolean updateStudent(Student student) {
		student stu = new student();
		if (student.getStuId() == null) {
			return false;
		}
		stu.setAddress(student.getAddress());
		Date date;
		try {
			date = sdf.parse(student.getBirth());stu.setBirth(date);;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		stu.setDepartment(student.getDepartment());
		stu.setId(student.getStuId());
		stu.setName(student.getStuName());
		stu.setSex(student.getSex());
		studentMapper.updateByPrimaryKey(stu);
		return true;
	}
}
