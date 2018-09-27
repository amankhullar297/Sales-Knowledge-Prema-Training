package com.prema.sales.daoImpl;
import java.util.*;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.prema.sales.entity.*;
import com.prema.sales.dao.*;
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
		@Autowired
	    SessionFactory  sessionFactory;
		@Override
		public String insert(Product p) {
			try {
			System.out.println("trying to get sessionfactory ");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to save record");
			int id = (int) session.save(p);
			System.out.println("record inserted");
			return "Product record inserted with id="+id;
			}catch(Exception e) {
				e.printStackTrace();
			return "Error";	
			}
		}

		@Override
		public String update(Product p) {
			try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("tryung to update");
			session.update(p);
			System.out.println("updated sucessfully");
			return "Product record updated with id="+p.getProductId();
			}catch(Exception q) {
				q.printStackTrace();
				return"Error";
			}
			}

		@Override
		public String delete(int id) {
	        try {
	        	System.out.println("trying to get session");
	        	Session session = sessionFactory.getCurrentSession();
	        	System.out.println("trying to delete");
	        	Product p = session.get(Product.class, id);
	        	session.delete(p);
	        	System.out.println("deleted");
	        	return "Product record deleted successfully with id="+p.getProductId();
	        }catch(Exception r) {
	        		r.printStackTrace();
	        		return "Error";
	        	}
			}

		@Override
		public List<Product> selectAll() {
			try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("query created");
		    Query q = session.createQuery("from Product ORDER BY productProvider ASC ");
		    List<Product> list =q.list();
		    System.out.println("list of product=> "+list);
			return  list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		}
		
		@Override
		public List<Product> selectAllByOrgId(int orgId) {
			try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("query created");
		    Query q = session.createQuery("from Product where orgId=:p");
		    q.setInteger("p", orgId);
		    List<Product> list =q.list();
		    System.out.println("list of product=> "+list);
			return  list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		}

		@Override
		public Product findById(int id) {
			 try {
		        	System.out.println("trying to get session");
		        	Session session = sessionFactory.getCurrentSession();
		        	System.out.println("trying to fetch");
		        	Product p = session.get(Product.class, id);
		        	System.out.println("data found");
		        	return p;
		        }catch(Exception r) {
		        		r.printStackTrace();
		        		return null;
		        	}
			}

		@Override
		public List<Product> findByName(String name) {
			try {
				System.out.println("trying to get session");
				Session session = sessionFactory.getCurrentSession();
				System.out.println("query created");
			    Query q = session.createQuery("from Product where name=:n");
			    q.setString("n", name);
			    List<Product> list =q.list();
				return  list;
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}
		}
	  }
