package com.example.PPC.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.awt.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "property")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true)
    private Long id;

    @Column(name = "Property_Code")
    private String code;

    @Column(name = "Property_Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "Property_Type_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_Property_Property_Type"))
    private PropertyType propertyType;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "District_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_Property_District"))
    private District district;

    @Column(name = "address")
    private String address;

    @Column(name = "area")
    private int area;

    @Column(name = "bed_room")
    private int bedRoom;

    @Column(name = "bath_room")
    private int bathRoom;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "installment_rate ")
    private float installmentRate;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "album")
    private String album;

    @ManyToOne
    @JoinColumn(name = "Property_Status_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_Property_Property_Status"))
    private PropertyStatus propertyStatus;

    @OneToMany(mappedBy = "property", orphanRemoval = true)
    private List<PropertyService> propertyServices = new ArrayList<>();

}