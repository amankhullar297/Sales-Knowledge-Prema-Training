package com.prema.sales;

import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prema.sales.dao.RegOrgDao;
import com.prema.sales.entity.Plan;
import com.prema.sales.entity.RegOrg;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegOrgTest {
	
	@Autowired
	RegOrgDao rodao;

	@Test
	public void contextLoads() {
		System.out.println(rodao.selectRegOrgView());
		
	}
	
	
	/*public void insert()
	{
		Date d = new Date(10, 10, 2018);
		RegOrg ro  = new RegOrg();
		ro.setOrgName("testsj");
		ro.setContactNo("783773");
		ro.setDate(d);
		ro.setEmail("sumits870@gmail.com");
		ro.setOrgAddress("new market");
		ro.setPlan(p);
		rodao.insert(ro);
	}*/
	
	/*@Test
	public void delete()
	{
		int orgId = 3;
		String result = rodao.delete(3);
		System.out.println(result);
	}*/
	
	
	public void update()
	{ 
		RegOrg ro = new RegOrg();
		Date d = new Date(11, 11, 2018);
		ro.setContactNo("83636");
		ro.setDate(d);
		ro.setEmail("sush73@gmail.com");
		ro.setOrgAddress("gsdgdfdg");
		ro.setOrgName("prema");
		//ro.setPlan(p);
		System.out.println(ro);
		String result = rodao.update(ro);
		System.out.println(result);
	}
	
	
	public void selectAll()
	{
		List<RegOrg> list = rodao.selectALL();
		System.out.println(list);
	}
		
	public void selectByName()
	{
		List<RegOrg> list=rodao.findByName("rishab");
		System.out.println(list);
	}
	
	
	public void selectById()
	{
		RegOrg s = rodao.findById(3);
		System.out.println(s);
	}
	
	
	
}



