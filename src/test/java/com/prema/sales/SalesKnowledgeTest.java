package com.prema.sales;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prema.sales.dao.SalesKnowledgeDao;
import com.prema.sales.dao.Studentdao;
import com.prema.sales.entity.ClientCategory;
import com.prema.sales.entity.ClientCompany;
import com.prema.sales.entity.OrgEmployee;
import com.prema.sales.entity.Product;
import com.prema.sales.entity.OrgEmployee;
import com.prema.sales.entity.SalesKnowledge;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SalesKnowledgeTest {
	


	@Autowired
	SalesKnowledgeDao skdao;
	
	
	public void contextLoads() {
		
	}
	
	public void insert() {
		SalesKnowledge sk=new SalesKnowledge();
		sk.setSaleStatus("y");
		ClientCompany c=new ClientCompany();
		c.setClientId(1);
		sk.setClientCompany(c);
		sk.setKnowledge("catia products are easy to deploy");
		sk.setKnowStatus("L");
		Product p=new Product();
		p.setProductId(1);
		sk.setProduct(p);
		OrgEmployee r=new OrgEmployee();
		r.setEmpId(2);
		sk.setRegEmployee(r);
		java.util.Date d=new java.util.Date();
		java.sql.Date date=new java.sql.Date(d.getTime());
		sk.setEntryDate(date);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		try {
			java.util.Date dt=sdf.parse("20/07/2017") ;
	java.sql.Date dd=new java.sql.Date(dt.getTime());
	System.out.println(dd);
		}catch(Exception e) {
			e.printStackTrace();
		}
		sk.setEntryDate(date);
		
		String result=skdao.insert(sk);
		System.out.println(result);
	}
     
	public void delete() {
		int id=2;
		String result=skdao.delete(id);
		System.out.println(result);
		
	}
     
	public void update() {
		SalesKnowledge sk=new SalesKnowledge();
		sk.setSalesId(3);
		ClientCompany c=new ClientCompany();
		c.setClientId(3);
		sk.setClientCompany(c);
		sk.setKnowledge("knowledge");
		Product p=new Product();
		p.setProductId(3);
		sk.setProduct(p);
		OrgEmployee e=new OrgEmployee();
	    e.setEmpId(4);
		sk.setRegEmployee(e);
		sk.setKnowStatus("L");
		sk.setSaleStatus("Y");
		String result=skdao.update(sk);
		System.out.println(result);
		
		}
	
	public void selectByOrgId() {
	List<SalesKnowledge> list=skdao.selectByOrgId(1);
	System.out.println(list);
	}
	
	public void selectByClientId() {
		List<SalesKnowledge> list=skdao.selectByClientId(1);
		System.out.println(list);
		}
	
	public void selectByProductId() {
		List<SalesKnowledge> list=skdao.selectByProductId(1);
		System.out.println(list);
		}
	
	
	public void selectByOrgAndProductId() {
		List<SalesKnowledge> list=skdao.selectByOrgAndProductId(1,1);
		System.out.println(list);
		}
	
	public void selectByClientAndProductId() {
		List<SalesKnowledge> list=skdao.selectByClientAndProductId(1,1);
		System.out.println(list);
		}
	
	public void selectByClientAndProductAndOrgId() {
		List<SalesKnowledge> list=skdao.selectByClientAndProductAndOrgId(1,1,1);
		System.out.println(list);
		}
	@Test 
	public void selectByOrgAndClientId() {
		List<SalesKnowledge> list=skdao.selectByOrgAndClientId(1, 2);
		System.out.println(list);
	}
	
	
	
	
	public void findById() {
		int id=3;
		SalesKnowledge sk=skdao.findById(id);
		System.out.println(sk);
	}
	


}

