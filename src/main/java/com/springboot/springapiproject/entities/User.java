package com.springboot.springapiproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter
public class User {
    
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<String> address;
    private String profile;
    private List<String> favouriteProducts;

    public User() {
        
    }
}
