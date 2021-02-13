package com.example.springbootpractise.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student daniel = new Student(
                    1L,
                    "Daniel",
                    "daniel.persson@frontedgeit.se",
                    LocalDate.of(1990, FEBRUARY, 12)
            );

            Student john = new Student(
                    2L,
                    "John",
                    "john.doe@frontedgeit.se",
                    LocalDate.of(1995, FEBRUARY, 15)
            );

            repository.saveAll(
                    List.of(daniel, john)
            );
        };
    }
}
