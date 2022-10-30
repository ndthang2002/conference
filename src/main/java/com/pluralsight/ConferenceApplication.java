package com.pluralsight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.pluralsight.model.Girl;
import com.pluralsight.model.Student;

@SpringBootApplication
@EnableConfigurationProperties
public class ConferenceApplication extends SpringBootServletInitializer implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ConferenceApplication.class, args);
	}
	
	@Autowired
	Student stu;
	
	@Override
	public void run(String...args) throws Exception{
	  System.out.println("Email: " +stu.getEmail());
	  System.out.println("ten: "+stu.getTen());
	}
}
