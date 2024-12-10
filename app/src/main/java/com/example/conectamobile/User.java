package com.example.conectamobile;

public class User {
    private String name;
    private String email;

    // Constructor vacío requerido por Firebase
    public User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
