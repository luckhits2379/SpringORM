package com.ng.spring.orm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.ng.spring.orm.entity.Student;

public class StudentDAO {
	


	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		
		int res = (int) hibernateTemplate.save(student);
		
		return res;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	

}
