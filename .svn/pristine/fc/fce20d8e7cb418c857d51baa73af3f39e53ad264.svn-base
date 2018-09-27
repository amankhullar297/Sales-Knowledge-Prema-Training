package com.prema.sales;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prema.sales.dao.PssEmployeeDao;
import com.prema.sales.entity.PssEmployee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PssEmployeeTest {
	@Autowired
	private PssEmployeeDao pssemp;

	@Test
	public void contextLoads() {
		
		//insert();
		pssemp.selectAllByBlock('U');
	}

	public void insert() {
		PssEmployee psem = new PssEmployee();
		java.util.Date d= new java.util.Date();
		java.sql.Date doj = new java.sql.Date(d.getTime());
		psem.setEmail("l");
        psem.setEmpAddress("bhopal");
		psem.setEmpId(6);
		psem.setEmpName("akash");
		psem.setMobileNo("7833238");
		psem.setPwd("57");
		psem.setPwdstatus("A");
		psem.setRole("E");
		String result = pssemp.insert(psem);
		System.out.println(result);

	}

	public void delete() {
		int id = 1;
		String result = pssemp.delete(id);
		System.out.println(result);
	}

	public void update() {
		PssEmployee psem = new PssEmployee();
		psem.setEmpAddress("bhopal");
		psem.setEmpId(2);
		psem.setEmpName("akashmanish");
		psem.setMobileNo("7833238");
		psem.setPwd("647");
		psem.setPwdstatus("");
		psem.setRole("manager");
		String result = pssemp.update(psem);
		System.out.println(result);
	}

	public void selectAllByBlock() {
		//PssEmployee psem = new PssEmployee();
		//psem.setBlockstatus(""+status);

		List <PssEmployee> List = pssemp.selectAllByBlock('U');
		System.out.println(List);
	}
	public void findByName() {
		List<PssEmployee> List = pssemp.selectAllNameStartingWith("employee");
		System.out.println(List);
	}

	public void findById() {
		PssEmployee psem = pssemp.findById(2);
		System.out.println(psem);
	}
}
