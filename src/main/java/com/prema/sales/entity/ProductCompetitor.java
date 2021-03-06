package com.prema.sales.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ProductCompetitor")
public class ProductCompetitor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int compId;
	@ManyToOne
	@JoinColumn(name = "productId", referencedColumnName = "productId")
	private Product product;
	@Column
//	@Pattern(regexp="^\\p{L}+(?: \\p{L}+)*$")
	private String compName;
	@Column
	
	private String productType;
	@Column
	
	private String productProvider;
	@Column
	private String status;

	
	public int getCompId() {
		return compId;
	}


	public void setCompId(int compId) {
		this.compId = compId;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public String getCompName() {
		return compName;
	}


	public void setCompName(String compName) {
		this.compName = compName;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public String getProductProvider() {
		return productProvider;
	}


	public void setProductProvider(String productProvider) {
		this.productProvider = productProvider;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "ProductCompetitor [compId=" + compId + ", product=" + product + ", compName=" + compName
				+ ", productType=" + productType + ", productProvider=" + productProvider + ", status=" + status + "]";
	}

}
