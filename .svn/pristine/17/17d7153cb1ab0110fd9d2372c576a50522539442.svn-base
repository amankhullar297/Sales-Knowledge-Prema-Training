package com.prema.sales.dao;

import java.util.*;

import com.prema.sales.entity.OrgEmployee;
import com.prema.sales.entity.PssEmployee;

public interface OrgEmployeeDao {
	public String insert(OrgEmployee regemp );
	public String update(OrgEmployee regemp);
	public int delete(int id);
	public List<OrgEmployee> selectAll();
	public OrgEmployee findByEmpId(int id);
	public List<OrgEmployee>findByEmpName(String name);
	public List<OrgEmployee>findByOrgIdAndRole(int orgId,char role);
	List<OrgEmployee> selectOrgEmpView();
	boolean blockAndUnblock(int oe, String status);
	
	
}

	
	
	
	


