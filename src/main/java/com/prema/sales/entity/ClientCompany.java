package com.prema.sales.entity;

import javax.persistence.*;

@Entity
@Table(name="ClientCompany")
public class ClientCompany {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int clientId;
	@Column
	private String clientName;
	@Column
	private String clientAddress;
	@ManyToOne
	@JoinColumn(name="orgId",referencedColumnName="orgId")
	private RegOrg regOrg;
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	
	
	
	
	public RegOrg getRegOrg() {
		return regOrg;
	}
	public void setRegOrg(RegOrg regOrg) {
		this.regOrg = regOrg;
	}
	@Override
	public String toString() {
		return "ClientCompany [clientId=" + clientId + ", clientName=" + clientName + ", clientAddress=" + clientAddress
				+ ", regOrg=" + regOrg + "]";
	}
	
}
