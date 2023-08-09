package com.arishin.mySpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@Slf4j
@SpringBootApplication
public class MySpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(MySpringApplication.class, args);
		System.out.println("Добро пожаловать в мой спринг проект!!!");
	}

// for actuator http://localhost:8081/monitor
	//http://localhost:8081/monitor/health/diskSpace
//actuator
	//hateoas
}
