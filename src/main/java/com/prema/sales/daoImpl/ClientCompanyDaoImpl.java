package com.prema.sales.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prema.sales.dao.ClientCompanyDao;
import com.prema.sales.entity.ClientCompany;
import com.prema.sales.entity.RegOrg;

@Repository
@Transactional
public class ClientCompanyDaoImpl implements ClientCompanyDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	
	public String insert(ClientCompany c) {
		try {
	System.out.println("trying to get sessionFactory");
	Session session=sf.getCurrentSession();
	System.out.println("save record");
	int id=(int) session.save(c);
	System.out.println("record inserted");
	return "Client company record inserted with Id"+id;
		}catch(Exception e) {
			e.printStackTrace();
			return "Error";
		}
	
	}

	@Override
	public String update(ClientCompany c) {
		try {
			System.out.println("trying to get sessionFactory");
			Session session=sf.getCurrentSession();
			System.out.println("trying to update");
			session.update(c);
			System.out.println("record updated");
			return "Client Company record updated with id"+c.getClientId();
		}catch(Exception w) {
			w.printStackTrace();
			return "Error";
		}
	}

	
	
	@Override
	public List<ClientCompany> selectByOrgId(int orgId) { 
		try {
			System.out.println("trying to get sessionFactory");
			Session session=sf.getCurrentSession();
			System.out.println("trying to find record by id");

			Query query=session.createQuery("from ClientCompany where regOrg=:orgId").setInteger("orgId", orgId);
			System.out.println("trying to create list of OrgId");
			List<ClientCompany> list=query.list();
			System.out.println("list created");
		return list;
	}catch(Exception z) {
		z.printStackTrace();
		return null;
	}
	}
		@Override
		public ClientCompany selectByclientId(int clientId) { 
			try {
				System.out.println("trying to get sessionFactory");
				Session session=sf.getCurrentSession();
				System.out.println("trying to find record by id");

				Query query=session.createQuery("from ClientCompany where clientId=:clientId").setInteger("clientId", clientId);
				System.out.println("trying to create list of OrgId");
			     ClientCompany list=(ClientCompany) query.uniqueResult();
				System.out.println("list created");
			return list;
		}catch(Exception za) {
			za.printStackTrace();
			return null;
		}
		}
		@Override
		public List<ClientCompany> selectAll() {
			try {
				System.out.println("trying to create session");
				Session session = sf.getCurrentSession();
				System.out.println("trying to create query");
				Query query = session.createQuery("from ClientCompany"); // use class-name, class contains table-name
				System.out.println("trying to create list");
				List<ClientCompany> list = query.list();
				System.out.println("list is created");
				return list;
			} catch (Exception exp) {
				exp.printStackTrace();
				return null;
			}
		}


	
	
}
