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
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student billy = new Student(
                    "Billy",
                    "billy@gmail.com",
                    LocalDate.of(2006, Month.JUNE, 10)
            );

            Student zhi = new Student(
                    "Zhi",
                    "zhi@gmail.com",
                    LocalDate.of(2006, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(billy, zhi)
            );

        };
    }
}
