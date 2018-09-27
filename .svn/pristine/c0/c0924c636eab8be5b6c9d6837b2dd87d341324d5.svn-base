package com.prema.sales.daoImpl;

import com.prema.sales.dao.PssRateDao;
import com.prema.sales.entity.PssRate;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public class PssRateDaoImpl implements PssRateDao{
@Autowired
SessionFactory sessionFactory;

@Override
public String insert(PssRate k) {
	try {
		System.out.println("Trying to get SessionFactory");
		Session session= sessionFactory.getCurrentSession();
		System.out.println("Trying to save records");
		int PssId=(int)session.save(k);
		System.out.println("Record Inserted");
		return "Rating record inserted with PssId"+PssId;
	}catch(Exception e) {
		e.printStackTrace();
	return "Error";
}}

@Override
public String update(PssRate k) {
	try {
		Session session= sessionFactory.getCurrentSession();
		System.out.println("Trying to update");
		session.update(k);
		System.out.println("Record Updated");
		return "Rating record updated with PssId"+k.getRateId();
	}catch(Exception e) {
		e.printStackTrace();
	return "Error";
}}
@Override
public List<PssRate> selectAll() {
	try {
		System.out.println("Trying to get Session");
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Query created");
		Query q=session.createQuery("from PssRate");
		//q.setInteger("n", orgId1);
		List<PssRate> list=q.list();
		return list;
		}
	catch(Exception e) {
		e.printStackTrace();
		return null;
		}}

@Override
public PssRate findById(int RateId) {
	try {
		System.out.println("Trying to get session");
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Trying to find by TRId"+RateId);
		PssRate k=session.get(PssRate.class,RateId);
		System.out.println("Found");
		return k;
		}
	catch(Exception e) {
		e.printStackTrace();
		return null;
		}}


}
