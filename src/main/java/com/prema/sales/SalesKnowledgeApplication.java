package com.prema.sales;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.prema.sales")
@EntityScan(basePackages= {"com.prema.sales"})
public class SalesKnowledgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesKnowledgeApplication.class, args);
	}
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	@Bean
	public SessionFactory getSessionFactory() {
		
		SessionFactory sessionFactory=entityManagerFactory.unwrap(SessionFactory.class);
		if(sessionFactory==null) {
			throw new NullPointerException("Factories are not sessionfactory");
		}
		else {
			return  sessionFactory;
		}
		
	}
}
