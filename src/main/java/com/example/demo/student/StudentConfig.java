package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    22);

            Student alex = new Student(
                    "Alex",
                    "Alex.Smith@gmail.com",
                    LocalDate.of(1993, Month.APRIL, 17),
                    29);

            Student josh = new Student(
                    "josh",
                    "josh.browne@gmail.com",
                    LocalDate.of(1999, Month.JANUARY, 13),
                    23);

            studentRepository.saveAll(
                    List.of(mariam, alex, josh));
        };
    }
}
