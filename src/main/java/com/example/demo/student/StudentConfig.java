package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

@Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                 Student mariam = new Student(1L,
                            "Mariam",21 ,
                            LocalDate.of(2000, Month.AUGUST, 5),
                            "mariam.jamal@gmail.com");

            Student alex = new Student(1L,
                    "Alex",21 ,
                    LocalDate.of(2000, Month.AUGUST, 5),
                    "alex.jamal@gmail.com");

            repository.saveAll(List.of(mariam, alex));
        };

    }
}
