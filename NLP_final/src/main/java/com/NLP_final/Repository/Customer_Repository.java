package com.NLP_final.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.NLP_final.model.Customer;

public interface Customer_Repository extends JpaRepository<Customer,Long> {

	
	}

