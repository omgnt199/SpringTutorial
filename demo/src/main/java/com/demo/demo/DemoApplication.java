package com.demo.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
		Outfit outfit = context.getBean(Outfit.class);
		System.out.println("Instance:" + outfit);
		outfit.wear();
	}


}
