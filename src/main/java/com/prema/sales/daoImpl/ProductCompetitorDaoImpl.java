package com.prema.sales.daoImpl;

import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.prema.sales.dao.*;
import com.prema.sales.entity.*;

@Repository
@Transactional
public class ProductCompetitorDaoImpl implements ProductCompetitorDao {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public String insert(ProductCompetitor pc) {
		try {
			System.out.println("trying to get sessionfactory");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to save records");
			int compId = (int) session.save(pc);
			System.out.println("record inserted");
			return "successful";
		} catch (Exception e) {
			return "Error";
		}
	}

	@Override
	public String update(ProductCompetitor pc) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to update");
			session.update(pc);
			System.out.println("update successfully");
			return "successful";
		} catch (Exception q) {
			q.printStackTrace();
			return "Error";
		}
	}

	@Override
	public String delete(int compId) {
		try {
			System.out.println("trying to get sessionFactory");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to delete");
			ProductCompetitor pc = session.get(ProductCompetitor.class, compId); // find operation
			System.out.println(compId);
			Query query = session.createQuery("update ProductCompetitor set status='delete' where compId=:name");
			query.setInteger("name", compId);
			query.executeUpdate();
			System.out.println("DELETED");
			return "success";
		} catch (Exception exp) {
			exp.printStackTrace();
			return "ERROR";
		}
	}

	@Override
	public List<ProductCompetitor> selectAll(int orgId) {
		try {
			System.out.println("trying to create session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to create query");
			System.out.println(orgId);
			Query query = session.createQuery("from ProductCompetitor where productId in (select productId from Product where orgId=:name)"); // use class-name, class contains table-name
			query.setInteger("name", orgId);
			System.out.println("trying to create list");
			List<ProductCompetitor> list = query.list();
			System.out.println("list is created");
			return list;
		} catch (Exception exp) {
			exp.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ProductCompetitor> selectAllActive(int orgId) {
		try {
			System.out.println("trying to create session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to create query");
			System.out.println(orgId);
			Query query = session.createQuery("from ProductCompetitor where productId in (select productId from Product where orgId=:name) and status='active'"); // use class-name, class contains table-name
			query.setInteger("name", orgId);
			System.out.println("trying to create list");
			List<ProductCompetitor> list = query.list();
			System.out.println("list is created");
			return list;
		} catch (Exception exp) {
			exp.printStackTrace();
			return null;
		}
	}

	@Override
	public ProductCompetitor findByCompId(int compId) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to fetch");
			System.out.println("compId" + compId);
			ProductCompetitor pc = session.get(ProductCompetitor.class, compId);
			System.out.println("data found");
			return pc;
		} catch (Exception r) {
			r.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ProductCompetitor> findByProductId(int productId) {
		try {
			System.out.println("trying to create session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to create query");
			Query query = session.createQuery("from ProductCompetitor where productId =:name");
			System.out.println(productId);
			query.setInteger("name", productId);
			System.out.println("trying to create list");
			List<ProductCompetitor> list = query.list();
			System.out.println("list is created");
			return list;
		} catch (Exception exp) {
			exp.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ProductCompetitor> findByCompName(String compName) {
		try {
			System.out.println("trying to create session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to create query");
			Query query = session.createQuery("from ProductCompetitor where compName =:name");
			System.out.println(compName);
			query.setString("name", compName);
			System.out.println("trying to create list");
			List<ProductCompetitor> list = query.list();
			System.out.println("list is created");
			return list;
		} catch (Exception exp) {
			exp.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ProductCompetitor> findByProductType(String productType) {
		try {
			System.out.println("trying to create session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to create query");
			Query query = session.createQuery("from ProductCompetitor where productType =:name");
			query.setString("name", productType);
			System.out.println("trying to create list");
			List<ProductCompetitor> list = query.list();
			System.out.println("list is created");
			return list;
		} catch (Exception exp) {
			exp.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ProductCompetitor> findByProductProvider(String productProvider) {
		try {
			System.out.println("trying to create session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to create query");
			Query query = session.createQuery("from ProductCompetitor where productProvider =:name");
			query.setString("name", productProvider);
			System.out.println("trying to create list");
			List<ProductCompetitor> list = query.list();
			System.out.println("list is created");
			return list;
		} catch (Exception exp) {
			exp.printStackTrace();
			return null;
		}
	}

}
