package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import dmacc.beans.Contact;
import dmacc.controller.BeanConfiguration;

@SpringBootApplication
public class SpringContactsApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringContactsApplication.class, args);
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Contact c = appContext.getBean("contact", Contact.class);
		System.out.println(c.toString());
	}
}