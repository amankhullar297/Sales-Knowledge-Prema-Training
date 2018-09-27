package com.prema.sales.entity;
import java.sql.Date;
import com.prema.sales.entity.SalesKnowledge;

//import javax.persistence.Column;
//import javax.persistence.Entity;
import javax.persistence.*;
@Entity
@Table(name="PlanHistory")

public class PlanHistory {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
     private int planHId;
	@JoinColumn(name="orgId")
	@ManyToOne
     private RegOrg regOrg ;
	@JoinColumn(name="planId",referencedColumnName = "planId")
	@ManyToOne
     private Plan plan;
	@Column
     private Date planDate;
	public int getPlanHId() {
		return planHId;
	}
	public void setPlanHId(int planHId) {
		this.planHId = planHId;
	}



	public RegOrg getRegOrg() {
		return regOrg;
	}
	public void setRegOrg(RegOrg regOrg) {
		this.regOrg = regOrg;
	}
	public Date getPlanDate() {
		return planDate;
	}
	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}
	
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	@Override
	public String toString() {
		return "PlanHistory [planHId=" + planHId + ", regOrg=" + regOrg.getOrgId() + ", plan=" + plan.getPlanId() + ", planDate=" + planDate
				+ "]";
	}


	
}



