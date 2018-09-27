package com.prema.sales;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prema.sales.dao.ClientCategoryDao;
import com.prema.sales.entity.ClientCategory;
import com.prema.sales.entity.ClientCompany;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientCategoryTest {
	@Autowired
    private ClientCategoryDao pd;
	
	@Test
	public void contextLoads() {
		//insert();
		//delete();
		//selectAll();
		//update();
		//selectByClientId();
		//selectByCategoryId();
		selectByCategory();
	}
	public void insert() {
	ClientCategory cl=new ClientCategory();
	//cl.setClientId(null);
	cl.setCategory("category 6");
	String result=pd.insert(cl);
	System.out.println(result);
		
	}
	public void delete() {
		int catId=6;
		String result=pd.delete(catId);
		System.out.println(result);
	}
	public void update() {
		ClientCategory cl=new ClientCategory();
		ClientCompany clientCompany = new ClientCompany();
		clientCompany.setClientId(1);
		//cl.setClientId(null);
		cl.setCatId(6);
		cl.setCategory("new1");
		String result=pd.update(cl);
		System.out.println(result);
	}
	public void selectAll() {
		List<ClientCategory> list=pd.selectAll(1);
		System.out.println(list);
	}
	public void selectByCategoryId() {
		ClientCategory c=pd.findByCategoryId(6);
		System.out.println(c);
	}
	public void selectByClientId() {
		List<ClientCategory> list=pd.findByClientId(3);
		System.out.println(list);
	}
	public void selectByCategory() {
		List<ClientCategory> list=pd.findByCategory("new");
		System.out.println(list);
	}
}
