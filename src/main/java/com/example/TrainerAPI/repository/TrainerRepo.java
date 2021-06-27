package com.example.TrainerAPI.repository;

import com.example.TrainerAPI.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepo extends JpaRepository<Trainer, Long> {
}
