package com.example.TrainerAPI.exception;

public class TrainerNotFoundException extends RuntimeException {
    public TrainerNotFoundException(Long id){
        super("No trainer found with id: " + id);
    }
}
