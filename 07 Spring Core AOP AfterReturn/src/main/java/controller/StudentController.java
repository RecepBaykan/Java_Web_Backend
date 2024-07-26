package controller;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import model.Student;
@Component("studentController")

public class StudentController {
	
	
	private List<Student> studentList;
	
	public List<Student> getStudentList() {
		return studentList;
	}
	
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void Listing() {
		
		for(Student student: studentList) {
			
			System.out.println(student.getName());
			System.out.println(student.getSurName());
			System.out.println(student.getNo());
		}
	}
	
	


}
