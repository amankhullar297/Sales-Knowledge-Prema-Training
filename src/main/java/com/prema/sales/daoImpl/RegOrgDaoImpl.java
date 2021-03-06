package com.prema.sales.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prema.sales.dao.OrgEmployeeDao;
import com.prema.sales.dao.RegOrgDao;
import com.prema.sales.entity.*;

@Repository
@Transactional
public class RegOrgDaoImpl implements RegOrgDao {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	OrgEmployeeDao orgEmployeeDao;

	/*@Override
	public String insert(RegOrg ro) {
		try {
			System.out.println("trying to get session factory");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to save record");
			System.out.println(ro);
			int orgId = (int) session.save(ro);
			System.out.println("record inserted");
			return "Student record inserted with id=" + orgId;
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";

		}
	}*/

	@Override
	public String update(RegOrg ro) {
		try {
		Session session = sessionFactory.getCurrentSession();
		System.out.println("trying to update");
		session.update(ro);
		System.out.println("updated sucessfully");
		return "RegOrg recorded with td ="+ro.getOrgId();
	}catch(Exception q )
	{
		q.printStackTrace();
		return "Error";
	}}

	/*@Override
	public String delete(int orgId) {
		try {
			System.out.println("trying to get session ");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to delete");
			RegOrg ro = session.get(RegOrg.class, orgId);
			session.delete(ro);
			System.out.println("deleted");
			return "student record deleted sucessfull with id =" +ro.getOrgId();
			
		}catch(Exception p)
		{p.printStackTrace();
			return "Error";
		}
	}*/

	@Override
	public List<RegOrg> selectALL() {
		try {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from RegOrg");
		List<RegOrg> list=q.list();
		return list;
		}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
		}

	@Override
	public RegOrg findById(int orgId) {
		try {
			System.out.println("trying to get session ");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to find by id"+orgId);
			RegOrg ro = session.get(RegOrg.class, orgId);
			System.out.println("found");
			return ro;
			
		}catch(Exception p)
		{p.printStackTrace();
		return null;
	}
	}
	@Override
	public List<RegOrg> findByName(String orgName) {
		try {
			System.out.println("tryinf to get session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("querry created");
			Query q = session.createQuery("from Student where name =:n ");
			q.setString("n", orgName);
			List<RegOrg> list=q.list();
			return list;
			}catch(Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public boolean blockAndUnblock(int ro,String status) {
		try {
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to update");
			Query q = session.createQuery("update OrgEmployee set blockStatus=:status where orgId=:n");
			q.setString("status", status);
			q.setInteger("n", ro).executeUpdate();
			System.out.println("updated sucessfully"+q);
			return true;
		}catch(Exception q )
		{
			q.printStackTrace();
			//return "Error";
		}
		return false;
	}

	@Override
	public List<RegOrg> findAllWithStatus() {
		
		try {
			Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from RegOrg");
			List<RegOrg> list=q.list();
			return list;
			}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<RegOrgStatusView> selectRegOrgView() {
		try {
			Session session = sessionFactory.getCurrentSession();
			Query q = session.createQuery("from RegOrgStatusView");
			List<RegOrgStatusView> list=(List<RegOrgStatusView>)q.list();
			
		
			return list;
			}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}


