package com.springboot.springapiproject;

import com.springboot.springapiproject.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringApiProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringApiProjectApplication.class, args);
    }

    @GetMapping
    public List<Student> hello(){
        return List.of(new Student(
                1L,
                "john",
                "johnDoe@gmail.com",
                LocalDate.of(2000, Month.APRIL, 5),
                25
        ));
    }
}
