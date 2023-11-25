package com.example.PPC.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.ui.Model;

@Data
@Entity
@Table(name = "account")
public class Account  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username",nullable = false, length = 100)
    private String username;

    @Column(name = "full_name",nullable = false, length = 100)
    private String fullName;

    @Column(name = "password",nullable = false,length = 100)
    private String password;

    @Column(name = "role",nullable = false, length = 30)
    private String role;

    @Column(name = "isActive")
    private boolean isActive;
}