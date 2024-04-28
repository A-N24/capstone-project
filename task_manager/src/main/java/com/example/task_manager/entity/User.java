package com.example.task_manager.entity;

import jakarta.persistence.*;

@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    // getters
    @SuppressWarnings("unused")
    public Long getId() { return id; }

    @SuppressWarnings("unused")
    public String getUsername() { return username; }

    @SuppressWarnings("unused")
    public String getPassword() { return password; }

    @SuppressWarnings("unused")
    public String getEmail() { return email; }

    // setters
    @SuppressWarnings("unused")
    public void setId(Long id) { this.id = id; }

    @SuppressWarnings("unused")
    public void setUsername(String username) { this.username = username; }

    @SuppressWarnings("unused")
    public void setPassword(String password) { this.password = password; }

    @SuppressWarnings("unused")
    public void setEmail(String email) { this.email = email; }

    // constructors
    public User() {}
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}