package com.prema.sales.entity;


	import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

	@Entity
	@Table(name="OrgEnq")
	public class OrgEnq {
		@Id
		@Column(name ="orgEnqId")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int OrgEnqId;
		@Column
		private String orgName;
		@Column
		private String orgAddress;
		@Column
		private String email;
		@Column
		private String contactNo;
		@JoinColumn(name="planId")
		@ManyToOne
		private Plan planId;
		@Column
		private Date enqDate; 
		@Column
		private char status;
		
		
		public int getOrgEnqId() {
			return OrgEnqId;
		}
		public void setOrgEnqId(int orgEnqId) {
			OrgEnqId = orgEnqId;
		}
		public String getOrgName() {
			return orgName;
		}
		public void setOrgName(String orgName) {
			this.orgName = orgName;
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
		
		
		public Plan getPlanId() {
			return planId;
		}
		public void setPlanId(Plan planId) {
			this.planId = planId;
		}
		public Date getEnqDate() {
			return enqDate;
		}
		public String getOrgAddress() {
			return orgAddress;
		}
		public void setOrgAddress(String orgAddress) {
			this.orgAddress = orgAddress;
		}
		public void setEnqDate(Date enqDate) {
			this.enqDate = enqDate;
		}
		public char getStatus() {
			return status;
		}
		public void setStatus(char status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "OrgEnq [(OrgEnqId=" + OrgEnqId + ", orgName=" + orgName + ", orgAddress=" + orgAddress + ", email="
					+ email + ", contactNo=" + contactNo + ", planId=" + planId.getPlanId() + ", enqDate=" + enqDate + ", status="
					+ status + "]";
		}
		
		
	}

