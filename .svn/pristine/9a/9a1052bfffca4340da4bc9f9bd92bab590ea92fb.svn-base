package com.prema.sales;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prema.sales.dao.OrgEmployeeDao;
import com.prema.sales.entity.OrgEmployee;
import com.prema.sales.entity.RegOrg;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OrgEmployeeTest {

	@Autowired
	OrgEmployeeDao employee;
	
	public void contextLoads() {
		
	}
	
	
	public void insert() throws ParseException
	{
		java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd/MM/yyyy");
	    String d="22/05/1996";
	    java.util.Date doj=sdf.parse(d);
	    java.sql.Date cdoj=new java.sql.Date(doj.getTime());
		OrgEmployee o  = new OrgEmployee();
		RegOrg regOrg = new RegOrg();
		regOrg.setOrgId(1);
		o.setOrganization(regOrg);
		o.setMobileNo("1234567890");
		o.setEmpName("ajay");
		o.setEmpAddress("bhopal");
		o.setEmail("sa@fdsa.com");
		o.setDoj(cdoj);
		o.setPwd("1234");
		o.setPwdStatus("A");
		o.setBlockStatus("U");
		o.setRole("A");
		System.out.println(o);
	    String result = employee.insert(o);
	    System.out.println(result);
	}
	
	
	public void delete()
	{
		int orgId = 6;
		int result = employee.delete(6);
		System.out.println(result);
	}
	
	
	public void update()
	{ 
		
		OrgEmployee o=employee.findByEmpId(7);
		//o.setEmpId(2);
		o.setEmpAddress("Pune");
		o.setEmpName("prema");
		o.setMobileNo("123212321");
		System.out.println(o);
		String result = employee.update(o);
		System.out.println(result);
		
	}
	
	
	public void selectAll()
	{
		
		List<OrgEmployee> list = employee.selectAll();
		
		System.out.println(list);
	}
	
	
	public void selectByEmpName()
	{
		
		List<OrgEmployee> list=employee.findByEmpName("prema");
		System.out.println(list);
	}
	
	@Test
	public void selectByEmpId()
	{
		OrgEmployee o = employee.findByEmpId(3);
		System.out.println(o);
	}
}
