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
public class PlanDaoImpl implements PlanDao{
	@Autowired
    SessionFactory sessionFactory;
	@Override
	public String insert(Plan p) {
		try {
			System.out.println("trying to get session factory");	
		Session session=sessionFactory.getCurrentSession();
		System.out.println("trying to get save records");
		int planId =(int)session.save(p);
		System.out.println("record inserted");
		return "Plan inserted";
	}catch(Exception e) {
		e.printStackTrace();
		return "Error";
	}
		}

	@Override
	public String update(Plan p) {
		try {
			System.out.println("trying to get session");
		
		Session session =sessionFactory.getCurrentSession();
		System.out.println("trying to update");
		session.update(p);
		System.out.println("update success");
		return "Plan updated";
	}catch(Exception q) {
		q.printStackTrace();
		return "error";
	}}
	@Override
	public String delete(int id) {
		try {
			System.out.println("trying to get session");
		
		Session session =sessionFactory.getCurrentSession();
		Plan p=session.get(Plan.class, id);
		//p.setStatus("I");
		System.out.println("trying to delete");
		p.setStatus("I");
		System.out.println("delete success");
		return "Plan deleted";
	}catch(Exception q) {
		q.printStackTrace();
		return "error";
	}}

	@Override
	public List<Plan> selectAllActivePlans() {
		try {
			System.out.println("trying to get session");
		Session session =sessionFactory.getCurrentSession();
		System.out.println("query created");
		Query q = session.createQuery("from Plan");
		List<Plan> list=q.list();
		return list;
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
	}
	@Override
	public List<Plan> selectActivePlans() {
		try {
			System.out.println("trying to get session");
		Session session =sessionFactory.getCurrentSession();
		System.out.println("query created");
		Query q = session.createQuery("from Plan where status='A'");
		List<Plan> list=q.list();
		return list;
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
	}
	@Override
	public Plan findByPlanId(int planId) {
		try {
			System.out.println("trying to get session");
		Session session =sessionFactory.getCurrentSession();
		System.out.println("trying to fetch");
		Plan p=session.get(Plan.class, planId);
		System.out.println("fetched");
		return p;
	}catch (Exception r) {
		r.printStackTrace();
		return null;
	}}

}
