package com.prema.sales.daoImpl;

import java.util.ArrayList;
import java.sql.Date;

import java.util.List;

import javax.transaction.Transactional;import org.aspectj.weaver.ast.Or;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.prema.sales.dao.OrgEnqdao;
import com.prema.sales.entity.OrgEnq;

 

@Repository
@Transactional
public class OrgEnqdaoImpl implements OrgEnqdao {

	@Autowired
    SessionFactory sessionFactory;

	class IllegalEmail extends Exception{}


	@Override
	public String insert(OrgEnq orgEnq) {
		System.out.println("trying to get session factory ");
		
		try
		{
			System.out.println("trying to get session factory ");
			Session session =sessionFactory.getCurrentSession();
            System.out.println("trying to save record");
            System.out.println(orgEnq);
            int contactNo=new Integer(orgEnq.getContactNo());
            if(contactNo>9999999999L | contactNo<0)
            	throw new Exception();
            if(orgEnq==null)
            	throw new Exception();
            //if()
            
              List<OrgEnq> ro = this.findByEmail(orgEnq.getEmail());
              System.out.println(ro);
              System.out.println("Hiiiii");
              if(ro.size()==1) {
            	  throw new IllegalEmail();
              }
              orgEnq.setStatus('p');
              orgEnq.setEnqDate(new Date(System.currentTimeMillis()));
              int i=(int)session.save(orgEnq);
  			 System.out.println("record inserted"+i);
            return "enquiry inserted";
		}
		catch(Exception e) {
			if (e.getClass()==IllegalEmail.class) {
				e.printStackTrace();
				return "Illegal Email";
			}
			else {
			e.printStackTrace();
			return "Exception Occured";
		}}
		
	}
	
	
	@Override
	public String delete(int id) {
		try
		{
			System.out.println("trying to get session Factory");
		Session session = sessionFactory.getCurrentSession();
		System.out.println("trying to delete record");
		OrgEnq oe = session.get(OrgEnq.class, id);
		if(oe==null)
		{
			throw new IllegalEmail();
		}
		session.delete(oe);
		return "enquiry record deleted : " + oe;
		}
		catch(Exception e)
		{
			if(e.getClass()==IllegalEmail.class)
			{
				e.printStackTrace();
			return "email record does not exist :"  ;	
			}
			else
			{
		e.printStackTrace();
		return "Exception Occured";
		}
		}
	}

	@Override
	public List<OrgEnq> findAll() {
		try {
			List<OrgEnq> list;
			System.out.println("trying to get session factory");
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Done wid d session");
		System.out.println("trying to select records");	
		Query q=session.createQuery("from OrgEnq");
		list=q.list();
		return  list;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<OrgEnq> acceptRequest(int id, String password) {
		System.out.println("trying to get session");
		Session session=sessionFactory.getCurrentSession();
		System.out.println("done wid session");
		SQLQuery query=session.createSQLQuery("CALL newOrg(:eid,:pwd)");
				//query.addEntity(OrgEnq.class);
				query.setParameter("eid", id);
				query.setParameter("pwd", password);
				query.executeUpdate();
				
				List<OrgEnq> list=findAll();
				return list;
		
	}

	    


	@Override
	public String update(OrgEnq orgEnq) {
		System.out.println("trying to get session factory ");
		
		try
		{
			System.out.println("trying to get session factory ");
			Session session =sessionFactory.getCurrentSession();
            System.out.println("trying to update record");
            System.out.println(orgEnq);
             session.update(orgEnq);
  			 System.out.println("record updated");
            return "enquiry updated : " +orgEnq;
	        }
		catch(Exception e) {
			if (e.getClass()==IllegalEmail.class) {
				e.printStackTrace();
				return "Illegal Email ";
			}
			else {
			e.printStackTrace();
			return "Exception Occured";
		}}
	}

	@Override
	public List<OrgEnq> findByEmail(String email) {
		try {
			System.out.println("tryinf to get session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("querry created");
			List<OrgEnq> list=new ArrayList<>();
			Query q = session.createQuery("from OrgEnq where email =:n ");
			q.setString("n", email);
			list=q.list();
			return list;
			}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
