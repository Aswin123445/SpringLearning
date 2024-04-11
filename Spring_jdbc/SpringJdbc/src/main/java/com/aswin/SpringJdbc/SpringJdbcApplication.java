package com.aswin.SpringJdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.aswin.SpringJdbc.model.Alien;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringJdbcApplication.class, args);
		Alien alien =context.getBean(Alien.class);
		alien.setId(4);
		alien.setName("aswin");
		alien.setTech("java");
		//to save the datas in the repositor we need object of repo sooo...
		AlienRepo repo=context.getBean(AlienRepo.class);
		repo.save(alien);
		System.out.println(repo.findAll());
	}

}
