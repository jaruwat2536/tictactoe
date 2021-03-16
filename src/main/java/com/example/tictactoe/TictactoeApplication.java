package com.example.tictactoe;

import com.example.tictactoe.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.tictactoe.entity.Student;

@SpringBootApplication
public class TictactoeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TictactoeApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(StudentRepository studentRepository) {
        return (args) -> {
            studentRepository.save(new Student(1L, "Jaurwat", "1839900301341"));
        };
    }

}
