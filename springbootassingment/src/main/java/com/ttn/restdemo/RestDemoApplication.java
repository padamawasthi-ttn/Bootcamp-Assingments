package com.ttn.restdemo;

import com.ttn.restdemo.model.Employee;
import com.ttn.restdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestDemoApplication implements CommandLineRunner{

	@Value("${spring.application.name}")
	private String appName;

	@Value("${app.version}")
	private String appVersion;

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);


	}

	@Override
	public void run(String... args) {
		System.out.println("Application Name: " + appName);
		System.out.println("Application Version: " + appVersion);

		// Insert records using JPA
		employeeRepository.save(new Employee(null, "Rahul", "Developer"));
		employeeRepository.save(new Employee(null, "Anjali", "Tester"));
		employeeRepository.save(new Employee(null, "Vikas", "Manager"));

		System.out.println("Sample employees inserted successfully!");

	}

}
