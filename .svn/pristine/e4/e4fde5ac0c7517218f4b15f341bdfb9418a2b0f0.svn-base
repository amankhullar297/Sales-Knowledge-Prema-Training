package com.prema.sales.entity;
import java.sql.Date;
import javax.persistence.*;
@Entity
@Table(name="PssRate")
public class PssRate {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int rateId;
	@JoinColumn(name="empId")
	@ManyToOne
	private OrgEmployee emp;
	@JoinColumn(name="fbId")
	@OneToOne
	private Feedback feedback;
	@Column
	private int rating;
	@Column
	private Date rateDate;
	public int getRateId() {
		return rateId;
	}
	public void setRateId(int rateId) {
		this.rateId = rateId;
	}


	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Date getRateDate() {
		return rateDate;
	}
	public void setRateDate(Date rateDate) {
		this.rateDate = rateDate;
	}
	public OrgEmployee getEmp() {
		return emp;
	}
	public void setEmp(OrgEmployee emp) {
		this.emp = emp;
	}
	public Feedback getFeedback() {
		return feedback;
	}
	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "PssRate [rateId=" + rateId + ", emp=" + emp + ", feedback=" + feedback + ", rating=" + rating
				+ ", rateDate=" + rateDate + "]";
	}



	
}
