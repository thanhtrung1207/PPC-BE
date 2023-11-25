package com.example.PPC.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "city_name",nullable = false)
    private String cityName;

    @OneToMany(mappedBy = "city", orphanRemoval = true)
    private List<District> districts = new ArrayList<>();

}