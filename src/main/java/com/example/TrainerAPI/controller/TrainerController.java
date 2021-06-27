package com.example.TrainerAPI.controller;

import com.example.TrainerAPI.model.Trainer;
import com.example.TrainerAPI.exception.TrainerNotFoundException;
import com.example.TrainerAPI.repository.TrainerRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrainerController {
    private  final TrainerRepo repo;

    public TrainerController(TrainerRepo repo) {
        this.repo = repo;
    }

    // Get all trainers
    @GetMapping("/trainers")
    List<Trainer> all() {
        return repo.findAll();
    }

    //Get single trainer
    @GetMapping("/trainers/{id}")
    Trainer single(@PathVariable Long id){
        return repo.findById(id).orElseThrow(() -> new TrainerNotFoundException(id));
    }

    // Add trainer
    @PostMapping("/trainers")
    Trainer newTrainer(@RequestBody Trainer newTrainer){
        return  repo.save(newTrainer);
    }
}
