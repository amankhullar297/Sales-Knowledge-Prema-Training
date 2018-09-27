package com.prema.sales;

import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prema.sales.dao.KnowledgeRateDao;
import com.prema.sales.entity.KnowledgeRate;
import com.prema.sales.entity.OrgEmployee;
import com.prema.sales.entity.SalesKnowledge;
@RunWith(SpringRunner.class)
@SpringBootTest
public class KnowledgeRateDaoTest {
	@Autowired
	private KnowledgeRateDao knowledgeRate ;
	@Test
	public void contextLoad() {
		insert();
		//update();
		//selectAll();
		//selectById();
		}
	public void insert() {
	Date d=new Date(System.currentTimeMillis());
	KnowledgeRate k=new KnowledgeRate();
	OrgEmployee org=new OrgEmployee();
	org.setEmpId(1);
	SalesKnowledge sk=new SalesKnowledge();
	sk.setSalesId(1);
	k.setOrgEmployee(org);
	k.setSalesKnowledge(sk);
	k.setRating(10);
	k.setRateStatus('L');
	k.setKnowDate(d);
	System.out.println(k);
	String result =knowledgeRate.insert(k);
	System.out.println(result);
		}
	
	public void update() {
		Date d=new Date(System.currentTimeMillis());
		KnowledgeRate k=new KnowledgeRate();
		k.setKnowId(1);
		k.setRating(2);
		k.setRateStatus('L');
		k.setKnowDate(d);
		System.out.println(k);
		String result =knowledgeRate.update(k);
		System.out.println(result);
	}
	public void selectAll() {
		List<KnowledgeRate>list=knowledgeRate.selectAll(1);
		System.out.println(list);
	}
	
}


