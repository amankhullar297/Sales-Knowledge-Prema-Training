package com.prema.sales.entity;
import javax.persistence.*;

import org.hibernate.annotations.GeneratorType;
	@Entity
	@Table(name="Plan")
	public class Plan {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="planId")
	private int planId;
		@Column(name="description")
	private String description;
		@Column(name="validity")
	private int validity;
		@Column(name="amount")
	private int amount;
		@Column(name="status")
	private String status;
		public int getPlanId() {
			return planId;
		}
		public void setPlanId(int planId) {
			this.planId = planId;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getValidity() {
			return validity;
		}
		public void setValidity(int validity) {
			this.validity = validity;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Plan [planId=" + planId + ", description=" + description + ", validity=" + validity + ", amount="
					+ amount + ", status=" + status + "]";
		}

	

	}


