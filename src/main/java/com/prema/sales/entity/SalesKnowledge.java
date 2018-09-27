package com.prema.sales.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SalesKnowledge")
public class SalesKnowledge {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "salesId")
	private int salesId;
	@JoinColumn(name = "empId", referencedColumnName = "empId")
	@ManyToOne
	private OrgEmployee regEmployee;
	@ManyToOne
	@JoinColumn(name = "clientId", referencedColumnName = "clientId")
	private ClientCompany clientCompany;
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;
	@Column(name = "salesDate")
	private Date salesDate;
	@Column(name = "saleStatus")
	private String saleStatus;
	@Column(name = "knowledge")
	private String knowledge;
	@Column(name = "entryDate")
	private Date entryDate;
	@Column(name = "knowStatus")
	private String knowStatus;

	public int getSalesId() {
		return salesId;
	}

	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}

	public OrgEmployee getRegEmployee() {
		return regEmployee;
	}

	public void setRegEmployee(OrgEmployee regEmployee) {
		this.regEmployee = regEmployee;
	}

	public ClientCompany getClientCategory() {
		return clientCompany;
	}

	public void setClientCompany(ClientCompany clientCompany) {
		this.clientCompany = clientCompany;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getKnowStatus() {
		return knowStatus;
	}

	public void setKnowStatus(String knowStatus) {
		this.knowStatus = knowStatus;
	}

	public Date getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

	@Override
	public String toString() {
		return "SalesKnowledge [salesId=" + salesId + ", regEmployee=" + regEmployee + ", clientCompany="
				+ clientCompany + ", product=" + product + ", salesDate=" + salesDate + ", saleStatus=" + saleStatus
				+ ", knowledge=" + knowledge + ", entryDate=" + entryDate + ", knowStatus=" + knowStatus + "]";
	}

	public String getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public ClientCompany getClientCompany() {
		return clientCompany;
	}

	public String getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

}
