package com.prema.sales.entity;

import java.sql.*;
import javax.persistence.*;
import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "Feedback")
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int fbid;
	
	//Foreign key
	@ManyToOne
	@JoinColumn(name="orgId", referencedColumnName="orgId")
	private RegOrg regOrg;
	
	@Column
	private String reviews;
	@Column
	private int rating=0;	
	
	//Set Default value to "H"
	@Column(name="fstatus")
	private String fStatus="H";
	
	@Column(name="fdate")
	private java.sql.Date d1;

	public int getFbid() {
		return fbid;
	}

	public void setFbid(int fbid) {
		this.fbid = fbid;
	}

	

	

	public RegOrg getRegOrg() {
		return regOrg;
	}

	public void setRegOrg(RegOrg regOrg) {
		this.regOrg = regOrg;
	}

	public String getReviews() {
		return reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getfStatus() {
		return fStatus;
	}

	public void setfStatus(String fStatus) {
		this.fStatus = fStatus;
	}

	public java.sql.Date getD1() {
		return d1;
	}

	public void setD1(java.sql.Date d1) {
		this.d1 = d1;
	}
	
	
	
	@Override
	public String toString() {
		return "Feedback [fbid=" + fbid + ", regOrg=" + regOrg + ", reviews=" + reviews + ", rating=" + rating
				+ ", fStatus=" + fStatus + ", d1=" + d1 + "]";
	}


	
}
