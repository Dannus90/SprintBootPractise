package com.example.springbootpractise;

import com.example.springbootpractise.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;

@SpringBootApplication
@RestController
public class SpringbootpractiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootpractiseApplication.class, args);
	}
	@GetMapping
	public List<Student> getStudents() {
		return List.of(
				new Student(
					1L,
					"Daniel",
					"daniel.persson@frontedgeit.se",
					LocalDate.of(1990, Month.FEBRUARY, 12),
					31
				)
		);
	}
}
