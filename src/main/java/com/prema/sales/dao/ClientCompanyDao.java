package com.prema.sales.dao;

import java.util.List;

import com.prema.sales.entity.*;


public interface ClientCompanyDao {
	
	public String insert(ClientCompany c);
	public String update(ClientCompany c);
	public List<ClientCompany> selectByOrgId(int orgId);
	public ClientCompany selectByclientId(int clientId);
	List<ClientCompany> selectAll();	
	

}
