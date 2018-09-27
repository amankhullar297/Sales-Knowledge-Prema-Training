package com.prema.sales.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.prema.sales.dao.PssEmpCngPasDao;
import com.prema.sales.entity.*;
import com.prema.sales.entity.PssEmpCngPass;


@Repository
@Transactional
public class PssEmpCngPasDaoImpl implements PssEmpCngPasDao{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public List<PssEmpCngPass> selectPassByEmpId(int empId) {
		try {
			System.out.println("Inside select PassByEmpId ");
			System.out.println("EmpId received="+empId);
			System.out.println("trying to get session ");
		Session session = sessionFactory.getCurrentSession();
		System.out.println("trying to get Query ");
		Query q=session.createQuery("from PssEmployeePassChange where empId=:n");
		q.setInteger("n", empId);
		//Query q = session.createQuery("from Feedback");
		System.out.println("Query = "+q);
		System.out.println("Creating List ");		
		List<PssEmpCngPass> list=q.list();
		System.out.println("List="+list);
		return list;
		}catch(Exception e) {
		e.printStackTrace();
		return null;
	}

}
}
