package dmacc.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Address;
import dmacc.beans.Contact;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Contact contact() {
		
		// Start Constructor Injection
		Contact bean = new Contact("Eric Carle");
		// end Constructor Injection
		
		// Start Setter Injection
		//Contact bean = new Contact();
		//bean.setName("Dr. Seuss");
		//bean.setPhone("555-555-5555");
		//bean.setRelationship("friend");
		// end Setter Injection
		
		return bean;
	}
	
	@Bean
	public Address address() {
		Address bean = new Address("123 Main Street", "Des Moines", "IA");
		return bean;
		
	}

}
