package com.mjprogramming.restapi.controler;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjprogramming.restapi.entity.Student;
import com.mjprogramming.restapi.repository.StudentRepository;



@RestController
public class StudentControler {
   
	@Autowired
	StudentRepository repo;
	
	//localhost:8080/SpringBootRestAPIProject/students
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		List<Student> students=repo.findAll();
		//return Arrays.asList(students); 		
		return students;
	}	
}
