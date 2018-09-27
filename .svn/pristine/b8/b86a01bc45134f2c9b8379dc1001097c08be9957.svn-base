package com.prema.sales.daoImpl;

import java.util.*;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prema.sales.dao.Studentdao;
import com.prema.sales.entity.Student;


@Repository
@Transactional
public class StudentDaoImpl implements Studentdao {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public String insert(Student s) {
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
			return "Error";

		}
	}

	@Override
	public String update(Student s) {
		try {
		Session session = sessionFactory.getCurrentSession();
		System.out.println("trying to update");
		session.update(s);
		System.out.println("undeted sucessfully");
		return "Student recorded with td ="+s.getId();
	}catch(Exception q )
	{
		q.printStackTrace();
		return "Error";
	}}

	@Override
	public String delete(int id) {
		try {
			System.out.println("trying to get session ");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to delete");
			Student s = session.get(Student.class, id);
			session.delete(s);
			System.out.println("deleted");
			return "student record deleted sucessfull with id =" +s.getId();
			
		}catch(Exception p)
		{p.printStackTrace();
			return "Error";
		}
	}

	@Override
	public List<Student> selectALL() {
		try {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Student");
		List<Student> list=q.list();
		return list;
		}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
		}

	@Override
	public Student findById(int id) {
		try {
			System.out.println("trying to get session ");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to find by id"+id);
			Student s = session.get(Student.class, id);
			System.out.println("found");
			return s;
			
		}catch(Exception p)
		{p.printStackTrace();
		return null;
	}
	}
	@Override
	public List<Student> findByName(String name) {
		try {
			System.out.println("tryinf to get session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("querry created");
			Query q = session.createQuery("from Student where name =:n ");
			q.setString("n", name);
			List<Student> list=q.list();
			return list;
			}catch(Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}






