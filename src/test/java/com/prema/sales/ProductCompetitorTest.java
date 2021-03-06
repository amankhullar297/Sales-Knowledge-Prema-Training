package com.prema.sales;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prema.sales.dao.ProductCompetitorDao;
import com.prema.sales.entity.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCompetitorTest {
	@Autowired
	private ProductCompetitorDao pcd;

	@Test
	public void contextLoads() {
		
		
//		 insert();
//		 update();
		 delete();
//		 selectAll();
		// selectByCompId();
		// selectByCompName();
//		 selectByProductId();
		// selectByProductType();
//		selectByProductProvider();
	}

	public void insert() {
		ProductCompetitor pc = new ProductCompetitor();
		Product p = new Product();
		p.setProductId(8);
		pc.setProduct(p);
		pc.setCompName("WPS");
		pc.setProductType("ppt");
		pc.setProductProvider("MicrosoftOffice");
		String result = pcd.insert(pc);
		System.out.println(result);
	}

	public void update() {
		ProductCompetitor pc = new ProductCompetitor();
		pc.setCompId(3);
		Product p = new Product();
		p.setProductId(5);
		pc.setProduct(p);
		pc.setCompName("WPS");
		pc.setProductType("word");
		pc.setProductProvider("NitroPro");
		String result = pcd.update(pc);
		System.out.println(result);
	}

	public void delete() {
		int compid = 3;
		String result = pcd.delete(compid);
		System.out.println(result);
	}

	public void selectAll() {
		List<ProductCompetitor> list = pcd.selectAll(1);
		System.out.println(list);
	}

	public void selectByCompId() {
		ProductCompetitor pc = pcd.findByCompId(3);
		System.out.println(pc);
	}

	public void selectByProductId() {
		List<ProductCompetitor> list = pcd.findByProductId(2);
		System.out.println(list);
	}

	public void selectByCompName() {
		List<ProductCompetitor> list = pcd.findByCompName("WPS");
		System.out.println(list);
	}

	public void selectByProductType() {
		List<ProductCompetitor> list = pcd.findByProductType("word");
		System.out.println(list);
	}

	public void selectByProductProvider() {
		List<ProductCompetitor> list = pcd.findByProductProvider("NitroPro");
		System.out.println(list);
	}
}
