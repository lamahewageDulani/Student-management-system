package com.drl.student.system;

import com.drl.student.system.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class StudentSystemApplication {

//	@Bean
//	public StudentService restTemplate() {
//		return new StudentService();
//	}

	public static void main(String[] args) {
		SpringApplication.run(StudentSystemApplication.class, args);
	}

}
