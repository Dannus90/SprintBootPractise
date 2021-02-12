package com.example.springbootpractise.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
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
