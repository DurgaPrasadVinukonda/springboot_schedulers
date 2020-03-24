package com.vs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages= {"com.vs.taskconfig"})
@EnableScheduling
public class SpringTaskSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTaskSchedulerApplication.class, args);
	}

}
