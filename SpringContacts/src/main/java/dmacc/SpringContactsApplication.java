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
public class SpringContactsApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringContactsApplication.class, args);
		//below changed as of page 16 of Spring Beans Into Tutorial - Contacts2020.pdf
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		//Contact c = appContext.getBean("contact", Contact.class);
		//System.out.println(c.toString());
	}
	
	@Autowired
	ContactRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		/*
		 * //Using an existing bean 
		 * Contact c = appContext.getBean("contact", Contact.class); c.setRelationship("best friend"); repo.save(c);
		 * 
		 * //Create a bean to use - not managed by Spring 
		 * Contact d = new Contact("Sandra Boyton", "555-555-5556", "friend"); 
		 * Address a = new Address("987 Elm Court", "Altoona", "IA"); d.setAddress(a); repo.save(d);
		 */
		
		
		  //Using existing bean again but different relationship
		  Contact myContactBean = appContext.getBean("contact", Contact.class);
		  myContactBean.setRelationship("Business Acquaintance");
		  repo.save(myContactBean);
		  
		  //Create another bean to use - not managed by Spring 
		  Contact myContact = new Contact("Will William", "515-555-5454", "child"); 
		  Address myContactAddr = new Address("1122 BuggieWoogie Ave", "Madrid", "IA");
		  myContact.setAddress(myContactAddr); repo.save(myContact);

		  List<Contact> allMyContacts = repo.findAll();
		  for(Contact people: allMyContacts) {
			  System.out.println(people.toString());
		  }

		  //closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
		  ((AbstractApplicationContext) appContext).close();
		
	}
}