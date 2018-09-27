package com.prema.sales.daoImpl;


import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prema.sales.dao.LoginDao;
import com.prema.sales.entity.OrgEmployee;
import com.prema.sales.entity.PssEmployee;

@Transactional
@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
    SessionFactory sessionFactory;
	
	@Override
	public PssEmployee getPssEmpByEmailPwd (String email,String pwd)
	{
		PssEmployee pssEmployee =null;
		try
		{
			Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from PssEmployee where email =:email and pwd= :pwd");
			q.setString("email", email);
			q.setString("pwd", pwd);
			pssEmployee=(PssEmployee)q.uniqueResult();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return pssEmployee;
	}
		
	@Override
	public OrgEmployee getOrgEmpByEmailPwd (String email,String pwd)
	{
		OrgEmployee orgEmployee =null;
		try
		{
			System.out.println("entered in orgemployee");
			Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from OrgEmployee where email =:e and pwd =:p");
			System.out.println("query tested");
			q.setString("e", email);
			q.setString("p", pwd);
			orgEmployee =(OrgEmployee)q.uniqueResult();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return orgEmployee;
	}
	}
	