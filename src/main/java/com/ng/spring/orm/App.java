package com.ng.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ng.spring.orm.dao.StudentDAO;
import com.ng.spring.orm.entity.Student;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ng/spring/orm/orm_config.xml");
		
		StudentDAO dao = context.getBean(StudentDAO.class);
		
		Student std = new Student(2, "Charan", "Dabdi");
		
		dao.insert(std);
		
	}
}
