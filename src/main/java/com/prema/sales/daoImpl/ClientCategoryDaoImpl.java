package com.prema.sales.daoImpl;


import java.util.*;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prema.sales.dao.ClientCategoryDao;
import com.prema.sales.entity.ClientCategory;
import com.prema.sales.entity.ClientCompany;
import com.prema.sales.entity.Student;


@Repository
@Transactional
public class ClientCategoryDaoImpl implements ClientCategoryDao {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public String insert(ClientCategory c) {
		try {
			System.out.println("trying to get session factory");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to save record");
			System.out.println(c);
			int catId = (int) session.save(c);
			System.out.println("record inserted");
			return " record inserted with catid=" + catId;
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";

		}
	}

	@Override
	public String update(ClientCategory c) {
		try {
		Session session = sessionFactory.getCurrentSession();
		System.out.println("trying to update");
		session.update(c);
		System.out.println("updated sucessfully");
		return "category record updated ="+c.getCatId();
	}catch(Exception q )
	{
		q.printStackTrace();
		return "Error";
	}}

	@Override
	public String delete(int catId) {
		try {
			System.out.println("trying to get session ");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to delete");
			ClientCategory s = session.get(ClientCategory.class, catId);
			session.delete(s);
			System.out.println("deleted");
			return " category deleted =" +s.getCatId();
			
		}catch(Exception p)
		{p.printStackTrace();
			return "Error";
		}
	}

	@Override
	public List<ClientCategory> selectAll(int orgId) {
		try {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from ClientCategory where clientId in (select clientId from ClientCompany where orgId=:n)");
		q.setInteger("n", orgId);
		List<ClientCategory> list=q.list();
		return list;
		}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
		}
	

	@Override
	public ClientCategory findByCategoryId(int catId) {
		try {
			System.out.println("trying to get session ");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to find by catId"+catId);
			ClientCategory s = session.get(ClientCategory.class, catId);
			System.out.println("found");
			return s;
			
		}catch(Exception p)
		{p.printStackTrace();
		return null;
	}
	}
	@Override
	public List<ClientCategory> findByClientId(int clientId) {
		try {
			System.out.println("trying to get session ");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to find by catId"+clientId);
			Query q = session.createQuery(" from ClientCategory where clientId=:n ");
			//Query q = session.createQuery("select clientName from ClientCompany where clientId=:clientId");
			//from ProductCompetitor where productId in (select productId from Product where orgId=:name)
			//Query q = session.createQuery("from ClientCategory where clientId in(select clientName from ClientCompany where clientId=:clientId)");
			q.setInteger("n", clientId);
			List<ClientCategory> list=q.list();
			return list;
			}catch(Exception e) {
			e.printStackTrace();
			return null;
	}
	}
	
	@Override
	public List<ClientCategory> findByCategory(String category) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("querry created");
			Query q = session.createQuery("from ClientCategory where category =:n ");
			q.setString("n", category);
			List<ClientCategory> list=q.list();
			return list;
			}catch(Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
