package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Address;
import dmacc.beans.Contact;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ContactRepository;

@SpringBootApplication
public class SpringContactsApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringContactsApplication.class, args);
	}
	
	
//	@Autowired
//	ContactRepository repo;
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//
//		
//		
//		  //Using existing bean again but different relationship
//		  Contact myContactBean = appContext.getBean("contact", Contact.class);
//		  myContactBean.setRelationship("Business Acquaintance");
//		  repo.save(myContactBean);
//		  
//		  //Create another bean to use - not managed by Spring 
//		  Contact myContact = new Contact("Will William", "515-555-5454", "child"); 
//		  Address myContactAddr = new Address("1122 BuggieWoogie Ave", "Madrid", "IA");
//		  myContact.setAddress(myContactAddr); repo.save(myContact);
//
//		  List<Contact> allMyContacts = repo.findAll();
//		  for(Contact people: allMyContacts) {
//			  System.out.println(people.toString());
//		  }
//
//		  //closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
//		  ((AbstractApplicationContext) appContext).close();
//		
//	}
	
	
}