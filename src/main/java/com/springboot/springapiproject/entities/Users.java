package com.springboot.springapiproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "users")
public class Users {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<String> address;
    private String profile;
    private List<String> favouriteProducts;

    public Users() {}

    public Users(String name, String email, String password, List<String> address, String profile, List<String> favouriteProducts) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.profile = profile;
        this.favouriteProducts = favouriteProducts;
    }

    public Users(Long id,
                 String name,
                 String email,
                 String password,
                 List<String> address,
                 String profile,
                 List<String> favouriteProducts) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.profile = profile;
        this.favouriteProducts = favouriteProducts;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getAddress() {
        return address;
    }

    public String getProfile() {
        return profile;
    }

    public List<String> getFavouriteProducts() {
        return favouriteProducts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                ", profile='" + profile + '\'' +
                ", favouriteProducts=" + favouriteProducts +
                '}';
    }
}
