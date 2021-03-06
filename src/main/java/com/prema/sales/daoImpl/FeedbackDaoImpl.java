package com.prema.sales.daoImpl;
import java.util.*;

import javax.transaction.Transactional;

import com.prema.sales.dao.FeedbackDao;
import com.prema.sales.entity.Feedback;

import java.util.*;


import javax.transaction.Transactional;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class FeedbackDaoImpl implements FeedbackDao {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public String insert(Feedback s) {
		try {
			System.out.println("trying to get session factory");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to save record");
			System.out.println(s);
			int id = (int) session.save(s);
			System.out.println("record inserted");
			return "Student record inserted with id=" + id;
		} catch (Exception e) {
			e.printStackTrace();
			return "*******************Error****************************";

		}
	}

	@Override
	public String delete(int id) {
		try {
			System.out.println("trying to get session ");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to delete");
			Feedback f = session.get(Feedback.class, id);
			session.delete(f);
			System.out.println("deleted");
			return "Feedback record deleted sucessfull with id =" +f.getFbid();
			
		}catch(Exception p)
		{p.printStackTrace();
			return "Error";
		}
	}

	@Override
	public List<Feedback> selectAll() {
		try {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Feedback");
		List<Feedback> list=q.list();
		return list;
		}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
		}

	
	@Override
	public List<Feedback> selectAllD() {
		try {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Feedback where fstatus='D'");
		List<Feedback> list=q.list();
		return list;
		}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
		}
	
	
	
	@Override
	public String update(Feedback s) {
		
		try {
			System.out.println("Trying to get session");
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Trying to update");
		session.update(s);
		System.out.println("Updated sucessfully");
		return "Student record updated with id="+s.getFbid();
		}catch(Exception q) {
			q.printStackTrace();
			return "Error";
		}
	}
	
	
	
	@Override
	public Feedback findById(int id) {
		try {
			System.out.println("trying to get session ");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to find by id"+id);
			Feedback f = session.get(Feedback.class, id);
			System.out.println("found");
			return f;
			
		}catch(Exception p)
		{p.printStackTrace();
		return null;
	}
	}


}