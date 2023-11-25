package com.example.PPC.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "service_name",nullable = false)
    private String serviceName;

    @OneToMany(mappedBy = "service", orphanRemoval = true)
    private List<PropertyService> propertyServices = new ArrayList<>();

}