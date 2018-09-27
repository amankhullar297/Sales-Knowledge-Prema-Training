package com.prema.sales.daoImpl;

import com.prema.sales.dao.KnowledgeRateDao;
import com.prema.sales.entity.KnowledgeRate;
import com.prema.sales.entity.SalesKnowledge;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public class KnowledgeRateDaoImpl implements KnowledgeRateDao{
@Autowired
SessionFactory sessionFactory;

@Override
public String insert(KnowledgeRate k) {
	try {
		System.out.println("Trying to get SessionFactory");
		Session session= sessionFactory.getCurrentSession();
		System.out.println("Trying to save records");
		int knowId=(int)session.save(k);
		System.out.println("Record Inserted");
		return "Rating record inserted with knowId"+knowId;
	}catch(Exception e) {
		e.printStackTrace();
	return "Error";
}}

@Override
public String update(KnowledgeRate k) {
	try {
		Session session= sessionFactory.getCurrentSession();
		System.out.println("Trying to update");
		session.update(k);
		System.out.println("Record Updated");
		return "Rating record updated with knowId"+k.getKnowId();
	}catch(Exception e) {
		e.printStackTrace();
	return "Error";
}}
@Override
public List<KnowledgeRate> selectAll(int orgId) {
	try {
		System.out.println("Trying to get Session");
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Query created");
		Query q=session.createQuery("from KnowledgeRate where empId in (select empId from OrgEmployee where orgId=:orgId)");
		q.setInteger("orgId", orgId);
		List<KnowledgeRate> list=q.list();
		return list;
		}
	catch(Exception e) {
		e.printStackTrace();
		return null;
		}}

@Override
public KnowledgeRate findByknowId(int knowId) {
	try {
		System.out.println("Trying to get session");
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Trying to find by KnowId"+knowId);
		
		Query q=session.createQuery("from KnowledgeRate where knowId =:knowId)");
		q.setInteger("knowId", knowId);
		KnowledgeRate k1=(KnowledgeRate) q.uniqueResult();
		KnowledgeRate k=  session.get(KnowledgeRate.class, knowId);;
		System.out.println("Found"+k1.toString());
		return k;
		}
	catch(Exception e) {
		e.printStackTrace();
		return null;
		}}

@Override
public List<KnowledgeRate> findByempId(int empId) {
	try {
		System.out.println("Trying to get session");
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Trying to find by empId"+empId);
		Query q=session.createQuery("from KnowledgeRate where empId =:empId)");
		q.setInteger("empId", empId);
		
		List<KnowledgeRate> k= q.list();
		System.out.println("Found"+q);
		return k;
		}
	catch(Exception e) {
		e.printStackTrace();
		return null;
		}}
}
