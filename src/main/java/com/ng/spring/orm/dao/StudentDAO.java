package com.ng.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.ng.spring.orm.entity.Student;

public class StudentDAO {
	

	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	@Transactional
	public int insert(Student student) {
		
		int res = (int) hibernateTemplate.save(student);
		
		return res;
	}
	
	public Student get(int studentId) {
		
		return hibernateTemplate.get(Student.class, studentId);
		
	}
	
	public List<Student> getAll(){
		
		return hibernateTemplate.loadAll(Student.class);
		
	}
	
	@Transactional
	public void delete(int studentId) {
		
		Student student = get(studentId);
		hibernateTemplate.delete(student);
		
	}
	
	@Transactional
	public void update(Student student) {
		
		hibernateTemplate.update(student);
	}
	
	
	
	
	

}
