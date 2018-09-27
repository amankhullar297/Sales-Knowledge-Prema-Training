package com.prema.sales;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prema.sales.dao.Studentdao;
import com.prema.sales.entity.SalesKnowledge;
import com.prema.sales.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SalesKnowledgeApplicationTests {

	@Autowired
	Studentdao studentdao;
	
	@Test
	public void contextLoads() {
		
	}

	public void insert()
	{
		Student student = new  Student();
		student.setName("testsj");
		studentdao.insert(student);
	}
	
	
}
