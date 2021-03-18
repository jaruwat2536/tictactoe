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
            historyRepository.save(new XOHistory(1L, new Date(), 4L, "[{\"key\":\"1-0\",\"value\":\"X\"},{\"key\":\"0-1\",\"value\":\"O\"},{\"key\":\"1-1\",\"value\":\"X\"},{\"key\":\"1-2\",\"value\":\"O\"},{\"key\":\"0-3\",\"value\":\"X\"},{\"key\":\"2-2\",\"value\":\"O\"},{\"key\":\"2-1\",\"value\":\"X\"},{\"key\":\"3-0\",\"value\":\"O\"},{\"key\":\"2-0\",\"value\":\"X\"},{\"key\":\"3-1\",\"value\":\"O\"},{\"key\":\"3-2\",\"value\":\"X\"},{\"key\":\"3-3\",\"value\":\"O\"},{\"key\":\"2-3\",\"value\":\"X\"},{\"key\":\"1-3\",\"value\":\"O\"},{\"key\":\"0-2\",\"value\":\"X\"},{\"key\":\"0-0\",\"value\":\"O\"}]"));
        };
    }

}
