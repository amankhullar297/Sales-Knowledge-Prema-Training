package com.prema.sales;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.prema.sales.dao.OrgEnqdao;
import com.prema.sales.entity.OrgEnq;
import com.prema.sales.entity.Plan;

import java.sql.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrgEnqTest {

	

		@Autowired
		OrgEnqdao orgEnqdao;
		
		@Test
		public void contextLoads() {
			//insert();
			//delete();
			//update();
			//findAll();
			accept();
			
		}
		
		public void insert()
		{
			OrgEnq orqEnq = new OrgEnq();
			orqEnq.setOrgName("nawal");
			orqEnq.setOrgAddress("C-41");
			orqEnq.setEmail("amankhullar297");
			orqEnq.setContactNo("8989468996");
			Plan p=new Plan();
			p.setPlanId(2);
			// Error due to planid and Plan
			//orqEnq.setPlanId(p);
			orqEnq.setEnqDate(new Date(System.currentTimeMillis()));
			//orqEnq.setOrgEnqId(3);
			orqEnq.setStatus('P');
			System.out.println("Testing Begins");
			String status=orgEnqdao.insert(orqEnq);
			System.out.println(status);

	}
		public void delete()
		{
		int id=3;
		String status=orgEnqdao.delete(id);
		System.out.println(status);
		}		
		public void update()
		{
			OrgEnq orqEnq = new OrgEnq();
			orqEnq.setOrgName("nawal");
			orqEnq.setOrgAddress("C-41");
			orqEnq.setEmail("amankhullar297");
			orqEnq.setContactNo("8989468996");
			Plan p=new Plan();
			p.setPlanId(2);
			//error due to plan id and plan many to one issue
			//orqEnq.setPlanId(p);
			orqEnq.setEnqDate(new Date(System.currentTimeMillis()));
			orqEnq.setOrgEnqId(4);
			orqEnq.setStatus('P');
			System.out.println("Testing Begins");
			String status=orgEnqdao.update(orqEnq);
			System.out.println(status);

	}
		public void findAll()
		{
			System.out.println("Testing begins");
			List<OrgEnq> list=orgEnqdao.findAll();
			for(OrgEnq oe:list) {
				System.out.println(oe);
			}
		}
		public void accept() {
			List<OrgEnq> list=orgEnqdao.acceptRequest(5, "1234");
			for(OrgEnq oe:list) {
				System.out.println(oe);
			}
			//System.out.println(list);
		}
		}