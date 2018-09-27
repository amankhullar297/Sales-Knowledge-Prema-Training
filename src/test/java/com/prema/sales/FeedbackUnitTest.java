package com.prema.sales;

import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prema.sales.entity.*;
import com.prema.sales.dao.*;
import com.prema.sales.daoImpl.*;


import java.util.Date;
import java.sql.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FeedbackUnitTest {
@Autowired
private FeedbackDao fd;

	@Test
	public void contextLoads() {
		insert();
	}
	
	public void insert() {

		
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

		System.out.println(sqlDate);
		Feedback fed = new Feedback();
		
		RegOrg regOrg = new RegOrg();
		regOrg.setOrgId(2);
		fed.setD1(sqlDate);
		fed.setRegOrg(regOrg);
		fed.setRating(5);
		fed.setReviews("Helpful");
		fed.setfStatus("H");
		String result=fd.insert(fed);
		System.out.println(result);
	}
}


