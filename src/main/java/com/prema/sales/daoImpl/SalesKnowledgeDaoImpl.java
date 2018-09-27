package com.prema.sales.daoImpl;

import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prema.sales.dao.SalesKnowledgeDao;
import com.prema.sales.entity.SalesKnowledge;

@Repository
@Transactional
public class SalesKnowledgeDaoImpl implements SalesKnowledgeDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public String insert(SalesKnowledge sk) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to save Salesknowledge record");
			System.out.println(sk);
			int id = (int) session.save(sk);

			System.out.println("sales knowledge record inserted");
			return "sales knowledge record inserted successfully";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}
	}

	@Override
	public String delete(int id) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to delete salesknowledge record");
			SalesKnowledge sk = session.get(SalesKnowledge.class, id);
			session.delete(sk);
			System.out.println("sales knowledge deleted");
			return "sales knowledge deleted successfully with id=" + id;
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}
	}

	@Override
	public String update(SalesKnowledge sk) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();
			System.out.println("trying to update salesknowledge record");
			session.update(sk);
			System.out.println("salesknowledge record updated");

			return "salesknowledge record updated uccessfully";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}
	}

	@Override
	public List<SalesKnowledge> selectByOrgId(int orgId) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();

			String query = "from SalesKnowledge where empId in (select empId from OrgEmployee where orgId=:n and knowStatus!='T')";
			Query q = session.createQuery(query).setParameter("n", orgId);
			System.out.println(q);
			// q.setInteger("n", 1);
			System.out.println("query created" + q);
			List<SalesKnowledge> list = q.list();
			System.out.println(list);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<SalesKnowledge> selectByOrgAndProductId(int orgId, int productId) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();

			String query = "from SalesKnowledge  empId in (select empId from OrgEmployee where orgId=:m) and productId=:p and knowStatus!='T'";
			Query q = session.createQuery(query);
			System.out.println(q);
			q.setInteger("m", orgId);
			q.setInteger("p", productId);

			System.out.println("query created" + q);
			List<SalesKnowledge> list = q.list();
			System.out.println(list);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<SalesKnowledge> selectByProductId(int productId) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();

			String query = "from SalesKnowledge where productId=:p and knowStatus!='T'";
			Query q = session.createQuery(query);
			System.out.println(q);
			q.setInteger("p", productId);

			System.out.println("query created" + q);
			List<SalesKnowledge> list = q.list();
			System.out.println(list);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<SalesKnowledge> selectByClientAndProductId(int clientId, int productId) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();

			String query = "from SalesKnowledge where clientId=:m and  productId=:n and knowStatus!='T'";
			Query q = session.createQuery(query);
			System.out.println(q);
			q.setInteger("m", clientId);
			q.setInteger("n", productId);

			System.out.println("query created" + q);
			List<SalesKnowledge> list = q.list();
			System.out.println(list);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<SalesKnowledge> selectByClientId(int clientId) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();

			String query = "from SalesKnowledge where clientId=:n and knowStatus!='T'";
			Query q = session.createQuery(query);
			System.out.println(q);
			q.setInteger("n", clientId);

			System.out.println("query created" + q);
			List<SalesKnowledge> list = q.list();
			System.out.println(list);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<SalesKnowledge> selectByClientAndProductAndOrgId(int clientId, int productId, int orgId) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();

			String query = "from SalesKnowledge  where empId in (select empId from OrgEmployee where orgId=:m) and productId=:n and clientId=:o and knowStatus!='T'";
			Query q = session.createQuery(query);
			System.out.println(q);
			q.setInteger("m", orgId);
			q.setInteger("n", productId);
			q.setInteger("o", clientId);

			System.out.println("query created" + q);
			List<SalesKnowledge> list = q.list();
			System.out.println(list);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<SalesKnowledge> selectByOrgAndClientId(int orgId, int clientId) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();

			String query = "from SalesKnowledge  where empId in (select empId from OrgEmployee where orgId=:m)  and clientId=:n and knowStatus!='T'";
			Query q = session.createQuery(query);
			System.out.println(q);
			q.setInteger("m", orgId);
			q.setInteger("n", clientId);

			System.out.println("query created" + q);
			List<SalesKnowledge> list = q.list();
			System.out.println(list);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	@Override
	public SalesKnowledge findById(int salesId) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();
			SalesKnowledge s = session.get(SalesKnowledge.class, salesId);
			System.out.println("data found" + s);
			return s;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<SalesKnowledge> selectByEmpId(int empId) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();

			String query = "from SalesKnowledge where empId=:n";
			Query q = session.createQuery(query);
			System.out.println(q);
			q.setInteger("n", empId);

			System.out.println("query created" + q);
			List<SalesKnowledge> list = q.list();
			System.out.println(list);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public String confirmKnowStatus(int salesId) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();

			String query = "update SalesKnowledge set knowStatus='L' where salesId= :b";
			Query q = session.createQuery(query);
			System.out.println(q);
			q.setInteger("b", salesId).executeUpdate();

			System.out.println("query created" + q);

			System.out.println("knowledge status updated to local");
			return "sales knowledge status confirmed successfully with id->"+salesId;
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}

		
	}
	@Override
	public String postToHive(int salesId) {
		try {
			System.out.println("trying to get session");
			Session session = sessionFactory.getCurrentSession();

			String query = "update SalesKnowledge set knowStatus='H' where salesId= :b";
			Query q = session.createQuery(query);
			System.out.println(q);
			q.setInteger("b", salesId).executeUpdate();

			System.out.println("query created" + q);

			System.out.println("knowledge status updated to hive");
			return "sales knowledge status confirmed successfully with id->"+salesId;
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}

		
	}
}
