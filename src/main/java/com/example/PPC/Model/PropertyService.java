package com.example.PPC.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "property_service")
public class PropertyService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;




    @ManyToOne
    @JoinColumn(name = "Service_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_Property_Service_Service"))
    private Service service;

    @ManyToOne
    @JoinColumn(name = "Property_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_Property_Service_Property"))
    private Property property;
}