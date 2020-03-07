package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dmacc.beans.Contact;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Contact contact() {
		Contact bean = new Contact();
		return bean;
	}

}
