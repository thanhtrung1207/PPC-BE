package com.example.PPC.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "property_type")
public class PropertyType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "property_type_name")
    private String propertyTpeName;

    @Column(name = "property_type_amount")
    private BigDecimal propertyTypeAmount;

}