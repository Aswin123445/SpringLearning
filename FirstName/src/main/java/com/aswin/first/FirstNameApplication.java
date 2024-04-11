package com.aswin.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstNameApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(FirstNameApplication.class, args);
		Alien obj=context.getBean(Alien.class);
		obj.code();
		
	}

}
