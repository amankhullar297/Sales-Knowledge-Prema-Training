package com.prema.sales.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name="RegOrgStatus")
public class RegOrgStatusView {
	@Id
	@Column
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int orgId;
	
	@Column
	private String orgName;
	@Column
	private String orgAddress;
	@Column
	private String email;
	@Column
	private String contactNo;
	@JoinColumn(name = "planId", referencedColumnName="planId")
	@ManyToOne
	private Plan plan;
	
	@Column(name = "regDate")
	private Date date;
	@Column
	private char blockStatus;
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
	public String getOrgAddress() {
		return orgAddress;
	}
	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public char getBlockStatus() {
		return blockStatus;
	}
	public void setBlockStatus(char blockStatus) {
		this.blockStatus = blockStatus;
	}
	@Override
	public String toString() {
		return "RegOrgStatusView [orgId=" + orgId + ", orgName=" + orgName + ", orgAddress=" + orgAddress + ", email="
				+ email + ", contactNo=" + contactNo + ", plan=" + plan + ", date=" + date + ", blockStatus="
				+ blockStatus + "]";
	}
	
	
	
	
	
	
	
	

}
