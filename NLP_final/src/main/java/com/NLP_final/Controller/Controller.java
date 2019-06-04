package com.NLP_final.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NLP_final.Repository.Customer_Repository;
import com.NLP_final.model.Customer;

@RestController
public class Controller {

		@Autowired
		//private NlpService serviceProvider;
		private Customer_Repository customerRepository;
		
		@RequestMapping("/submitQuery")
		public List<Customer> obtainResults()
		{
			
			List<Customer> customer=new ArrayList<>();
			customerRepository.findAll()
			.forEach(customer::add);
			return customer;
		}
	
}
