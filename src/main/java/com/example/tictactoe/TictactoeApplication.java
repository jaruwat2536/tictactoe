package com.example.tictactoe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.tictactoe.entity.XOHistory;
import com.example.tictactoe.repository.XOHistoryRepository;
import java.util.Date;

@SpringBootApplication
public class TictactoeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TictactoeApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(XOHistoryRepository historyRepository) {
        return (args) -> {
            historyRepository.save(new XOHistory(1L, new Date(), "{}"));
        };
    }

}
