package com.prema.sales.entity;

import java.sql.Date;

import javax.persistence.*;
@Entity
@Table(name ="PSS_Employee")
public class PssEmpCngPass {

	    public String getChkPass() {
		return chkPass;
	}
	public void setChkPass(String chkPass) {
		this.chkPass = chkPass;
	}
	public String getNewPass() {
		return newPass;
	}
	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}
	public String getConfirmNewPass() {
		return confirmNewPass;
	}
	public void setConfirmNewPass(String confirmNewPass) {
		this.confirmNewPass = confirmNewPass;
	}

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="emp_id")
		private int empId;
		@Column(name="empName")
		private String empName;
		@Column(name="empAddress")
		private String empAddress;
		@Column(name="email",unique = true)
		private String email;
		@Column(name="pwd")
		private String pwd;
		@Column(name="pwdstatus")
		private String pwdstatus;
		@Column(name="blockstatus")
		private String blockstatus;
		@Column(name="role")
		private String role;
		@Column(name="mobileNo")
		private String mobileNo;
		@Column(name="doj")
		private Date doj;
		
		private String chkPass;
		private String newPass;
		private String confirmNewPass;
		
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getPwdstatus() {
			return pwdstatus;
		}
		public void setPwdstatus(String pwdstatus) {
			this.pwdstatus = pwdstatus;
		}
		public String getBlockstatus() {
			return blockstatus;
		}
		public void setBlockstatus(String blockstatus) {
			this.blockstatus = blockstatus;
		}
		public Date getDoj() {
			return doj;
		}
		public void setDoj(Date doj) {
			this.doj = doj;
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
		
		@Override
		public String toString() {
			return "PssEmployee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress
					+ ", email=" + email + ", pwd=" + pwd + ", pwdstatus=" + pwdstatus + ", blockstatus="
					+ blockstatus + ", role=" + role + ", mobileNo=" + mobileNo + ", doj=" + doj + "]";
		}

		

}
