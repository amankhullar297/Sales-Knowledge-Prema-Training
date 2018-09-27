package com.prema.sales.entity;

import javax.persistence.*;

@Entity
@Table
public class ClientCategory {
   

	@Id
      @GeneratedValue(strategy=GenerationType.AUTO)
      @Column
      private int catId;
      
      @JoinColumn(name = "clientId", referencedColumnName="clientId")
      @ManyToOne
      private ClientCompany clientCompany;
      @Column
      private String category;
      public ClientCompany getClientCompany() {
  		return clientCompany;
  	}

  	public void setClientCompany(ClientCompany clientCompany) {
  		this.clientCompany = clientCompany;
  	}
	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "ClientCategory [catId=" + catId + ","+"clientId=" +clientCompany.getClientId()+ "nameclent="+clientCompany.getClientName() + "," + "category=" + category + "]";
	}
}
