package com.prema.sales.common;

import com.prema.sales.entity.OrgEmployee;
import com.prema.sales.entity.RegOrg;

public class SessionBean {
	int orgId;
	String orgName;
	int  empId;
	String empName;
	String role;
	RegOrg organization ;
	OrgEmployee orgEmployee;
	
	
	public SessionBean(int orgId, String orgName, int empId, String empName, String role) 
	{
		this.orgId= orgId;
		this.orgName = orgName;
		this.empId = empId;
		this.empName = empName;
		this.role = role;
	}
	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "SessionBin [orgId=" + orgId + ", orgName=" + orgName + ", empId=" + empId + ", empName=" + empName
				+ ", role=" + role + "]";
	}

}
