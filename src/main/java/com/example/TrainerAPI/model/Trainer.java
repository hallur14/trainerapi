package com.example.TrainerAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trainer {

    private @Id @GeneratedValue Long id;
    private String email;
    private String phone;
    private String firstName;
    private String lastName;

    public Trainer(){};

    public Trainer(String email, String phone, String firstName, String lastName){
        this.email = email;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId(){
        return this.id;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhone(){
        return this.phone;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }
}
