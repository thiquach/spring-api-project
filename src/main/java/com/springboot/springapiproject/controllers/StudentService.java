package com.springboot.springapiproject.controllers;

import com.springboot.springapiproject.entities.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(
                1L,
                "john",
                "johndoe@gmail.com",
                LocalDate.of(2000, Month.APRIL, 5),
                25
        ));
    }
}
