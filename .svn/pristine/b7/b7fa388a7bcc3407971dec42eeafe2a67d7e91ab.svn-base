package com.prema.sales.daoImpl;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prema.sales.dao.PssEmployeeDao;
import com.prema.sales.entity.*;
@Repository
@Transactional
public  class PssEmployeeDaoImpl implements PssEmployeeDao{
		private static final Serializable Empid = null;
		@Autowired
		SessionFactory sessionFactory;
		@Override
		public String insert(PssEmployee pssemp) {
			try {
				System.out.println("trying to get sessionfactorSy");
			 Session session = sessionFactory.getCurrentSession();
			 System.out.println("trying to save record");
			 int id =(int) session.save(pssemp);
			 System.out.println("record inserted");
				return "PssEmployee record inserted with id="+id;
			}catch(Exception e) {
				e.printStackTrace();
				return "Error";
				}
			
		}
		@Override
		public String update(PssEmployee pssemp) {
			try {
				System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to update");
			session.update(pssemp);
			System.out.println("updated succesfully");
			
			return "PssEmployee record updated with id="+pssemp.getEmpId();
			}
			catch(Exception q) {
				q.printStackTrace();
				return "error";
			}
			}
			
		
		@Override

		public String delete(int id) {
			try {
				System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("try to get delete");
			PssEmployee pssemp= session.get(PssEmployee.class ,Empid);
			session.delete(pssemp);
			System.out.println("delete succesfully");
			
			return "pssemployee record delete succesfully with id="+pssemp.getEmpId();
			
		}
			catch(Exception r) {
				r.printStackTrace();
				return "Error";
			}
			}
		@Override
		public List <PssEmployee>selectAllByBlock(char status) {
			try {
				
			System.out.println("trying to get list");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to get query");
			List<PssEmployee> list = session.createQuery("from PssEmployee where blockStatus=:status").setString("status", status+"").list();
			//List<PssEmployee> list = (List<PssEmployee> )session.createQuery("From PssEmployee where blockStatus='U'").list();
			
			System.out.println("selected all list succesfully"+list);
			return list;
			
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
			}
		
		@Override
		public List<PssEmployee> selectAll() {
			try {
				System.out.println("Function called");
			Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from PssEmployee");
			System.out.println("Query Excuted");
			List<PssEmployee> list=q.list();
			System.out.println("List="+list);
			return list;
			}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
			}

		@Override
		public PssEmployee findById(int Id) {try {
			System.out.println("trying to get session");
		Session session = sessionFactory.getCurrentSession();
		System.out.println("try to get fatch");
		PssEmployee pssemp= session.get(PssEmployee.class, Id);
		
		System.out.println("fatch succesfully");
		
		return pssemp;
		
	}
		catch(Exception r) {
			r.printStackTrace();
			return null;
		}
		}
		@Override
		public List<PssEmployee> selectAllNameStartingWith(String name) {
			try {
				
				System.out.println("trying to get list");
				Session session = sessionFactory.getCurrentSession();
				System.out.println("trying to get query");
				List<PssEmployee> list = (List<PssEmployee>) session.createQuery("From PssEmployee where name like  :n").list();
				
				System.out.println("selected all list succesfully");
				return list;
				}catch(Exception e) {
					e.printStackTrace();
					return null;
				}
		}
		@Override
		public boolean blockById(int Id,String status) {
			try {
				System.out.println("trying to get session");
				Session session = sessionFactory.getCurrentSession();

				String query = "update PssEmployee set blockStatus=:s where empId= :b";
				Query q = session.createQuery(query);
				System.out.println(q);
				q.setString("s", status);
				int i=q.setInteger("b", Id).executeUpdate();
				System.out.println("employee status updated"+i);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}		
			return false;
		}
		
	/*	@Override
		public List<PssEmployee> selectAll() {
			try {
			Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from PSS_Employee");
			List<PssEmployee> list=q.list();
			return list;
			}
			catch(Exception e) {
			e.printStackTrace();
			return null;
		}
			}*/
		

	}


