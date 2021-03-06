package com.prema.sales.entity;



import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table; 

@Entity
@Table(name="Org_Employee")
public class OrgEmployee {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="empId")
public int empId;
 @JoinColumn(name="orgId",referencedColumnName ="orgId")
 @ManyToOne
 public RegOrg organization;
@Column(name="empName")
public String  empName;
@Column(name="empAddress")
public String empAddress;
@Column(name="mobileNo")
public String mobileNo;
@Column(name="email")
public String email;
@Column(name="pwd")
public String pwd;
@Column(name="role")
public String role;
@Column(name="pwdStatus")
public String pwdStatus;
@Column(name="blockStatus")
public String blockStatus;
@Column(name="doj")
public Date doj;

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
public String getEmpAddress() {
	return empAddress;
}
public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public  String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getPwdStatus() {
	return pwdStatus;
}
public void setPwdStatus(String pwdStatus) {
	this.pwdStatus = pwdStatus;
}
public String getBlockStatus() {
	return blockStatus;
}
public void setBlockStatus(String blockStatus) {
	this.blockStatus = blockStatus;
}
public Date getDoj() {
	return doj;
}
public void setDoj(Date doj) {
	this.doj = doj;
}
public RegOrg getOrganization() {
	return organization;
}
public void setOrganization(RegOrg organization) {
	this.organization = organization;
}
@Override
public String toString() {
	return "OrgEmployee [empId=" + empId + ", organization=" + organization + ", empName=" + empName + ", empAddress="
			+ empAddress + ", mobileNo=" + mobileNo + ", email=" + email + ", pwd=" + pwd + ", role=" + role
			+ ", pwdStatus=" + pwdStatus + ", blockStatus=" + blockStatus + ", doj=" + doj + "]";
}


}







