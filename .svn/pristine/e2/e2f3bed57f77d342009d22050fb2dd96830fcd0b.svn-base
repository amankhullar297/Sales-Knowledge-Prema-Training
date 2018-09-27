package com.prema.sales;

import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.sql.Insert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prema.sales.dao.PlanHistoryDao;
import com.prema.sales.entity.Plan;
import com.prema.sales.entity.PlanHistory;
import com.prema.sales.entity.RegOrg;

@RunWith(SpringRunner.class)
@SpringBootTest

public class PlanHistoryApplicationTest {
	@Autowired
	private PlanHistoryDao phd;
	@Test
	public void contextLoads() {
		
	}
	
		
	public void insert()
	{
		PlanHistory ph= new PlanHistory();
	//	ph.setRegOrg(7);
		RegOrg ro= new RegOrg();
		ro.setOrgId(7);
		Plan plan = new Plan();
		plan.setPlanId(3);
		ph.setRegOrg(ro);
		ph.setPlan(plan);
		
		
		
		//SimpleDateFormat  sf = new SimpleDateFormat("dd/MM/yy");
		//java.util.Date d=sf.parse("12/06/2016");
		java.util.Date d= new java.util.Date();
		java.sql.Date sdate = new java.sql.Date(d.getTime());
		ph.setPlanDate(sdate);
		System.out.println(ph);
		String result= phd.insert(ph);
		System.out.println(result); 
		
	}
	public void update()
	{
		PlanHistory ph= new PlanHistory();
		
		
		RegOrg ro= new RegOrg();
		ro.setOrgId(7);
		Plan plan = new Plan();
		plan.setPlanId(3);
		ph.setRegOrg(ro);
		ph.setPlan(plan);
		
		ph.setPlanDate(null);
		System.out.println(ph);
		String result= phd.update(ph);
		System.out.println(result); 
		
	}
	public void	delete()  {
		int planHId =0;
		String result= phd.delete(0);
		System.out.println(result);
		
	}
	@Test
	public void selectAll() {
		List<PlanHistory> list=phd.selectAll();
		System.out.println(list);
	}
	public void selectByPlanHId() {
		PlanHistory p =phd.findByplanHId(0);
		System.out.println(p);
	}
	public void selectByOrgId() {
		List<PlanHistory> list = phd.findByOrgId("1");
		System.out.println(list);
	}
	
}
