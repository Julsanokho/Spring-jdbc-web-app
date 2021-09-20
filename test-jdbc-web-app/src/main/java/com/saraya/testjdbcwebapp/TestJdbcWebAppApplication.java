package com.saraya.testjdbcwebapp;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//@AutoConfigurationPackage
@SpringBootApplication
@ComponentScan(basePackages={"com.saraya.tesrtjdbcwebapp.controller"}) 
public class TestJdbcWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestJdbcWebAppApplication.class, args);
	}

}
