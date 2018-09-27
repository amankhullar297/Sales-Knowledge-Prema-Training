package com.prema.sales.entity;
import java.sql.Date;
import javax.persistence.*;
@Entity
@Table(name="KnowledgeRate")
public class KnowledgeRate {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int knowId;
	@ManyToOne
	@JoinColumn(name = "empId",referencedColumnName="empId")
	private OrgEmployee orgEmployee;
	@ManyToOne
	@JoinColumn(name="salesId",referencedColumnName="salesId")
	private SalesKnowledge salesKnowledge;
	@Column
	private int rating;
	@Column
	private Date knowDate;
	@Column
	private char rateStatus;
	
	public int getKnowId() {
		return knowId;
	}

	public void setKnowId(int knowId) {
		this.knowId = knowId;
	}

	public OrgEmployee getOrgEmployee() {
		return orgEmployee;
	}

	public void setOrgEmployee(OrgEmployee orgEmployee) {
		this.orgEmployee = orgEmployee;
	}

	public SalesKnowledge getSalesKnowledge() {
		return salesKnowledge;
	}

	public void setSalesKnowledge(SalesKnowledge salesKnowledge) {
		this.salesKnowledge = salesKnowledge;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getKnowDate() {
		return knowDate;
	}

	public void setKnowDate(Date knowDate) {
		this.knowDate = knowDate;
	}

	public char getRateStatus() {
		return rateStatus;
	}

	public void setRateStatus(char rateStatus) {
		this.rateStatus = rateStatus;
	}

	@Override
	public String toString() {
		return "knowledgeRate [knowId=" + knowId + ", empId=" + orgEmployee.getEmpId() + ", salesId=" + salesKnowledge.getSalesId() + ", rating=" + rating
				+ ", knowdate=" + knowDate + ", rateStatus=" + rateStatus + "]";
	}
	
}
