package com.example.springbootpractise.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path ="api/v1/student")
public class StudentController {
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
