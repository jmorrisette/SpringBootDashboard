package com.dashboard.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dashboard.web")
public class DashboardSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(DashboardSpringBoot.class, args);
	}
}
