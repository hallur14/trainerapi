package com.example.TrainerAPI.repository;

import com.example.TrainerAPI.model.Trainer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PopulateDatabase {

    @Bean
    CommandLineRunner initDatabase(TrainerRepo repo) {
        return args -> {
            repo.save(new Trainer("trainer@campgladiator.com", "5125125125", "Fearless", "Contender"));
            repo.save(new Trainer("trainer42@campgladiator.com", "5128881234", "Hafthor", "Bjornsson"));
            repo.save(new Trainer("trainer1337@campgladiator.com", "5124242123", "Jon", "Sigmarsson"));
        };
    }
}
