package com.NLP_final.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")


public class Customer {	
			@Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
			private int customerid;
			private String customerName;
			private String customerAddress;
			private String customerEmail;
			private String customerPhone;
			
			@Column(name="customerid")
			public int getCutomerid() {
				return customerid;
			}
			
			@Column(name="customer_name")
			public String getCustomerName() {
				return customerName;
			}
			
			@Column(name="customer_address")
			public String getCustomerAddress() {
				return customerAddress;
			}
			
			@Column(name="customer_email", unique = true)
			public String getCustomerEmail() {
				return customerEmail;
			}
			
			@Column(name="customer_phone", nullable=false,unique = true)
			public String getCustomerPhone() {
				return customerPhone;
			}

			@Override
			public String toString() {
				return "Customer [cutomerid=" + customerid + ", customer_name=" + customerName + ", customer_address="
						+ customerAddress + ", customer_email=" + customerEmail + ", customer_phone=" + customerPhone + "]";
			}
			
			
		
	


}
