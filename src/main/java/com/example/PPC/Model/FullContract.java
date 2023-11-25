package com.example.PPC.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;


import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "full_contract")
public class FullContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true)
    private Long id;

    @Column(name = "Full_Contract_Code")
    private String code;

    @Column(name = "Customer_Name",nullable = false)
    private String customerName;

    @Column(name = "Year_Of_Birth",nullable = false)
    private String yearOfBirth;

    @Column(name = "ssn")
    private String ssn;

    @Column(name = "Customer_Address ")
    private String customer_Address;

    @Column(name = "Mobile")
    private String phoneNumber;

    @Column(name = "Date_Of_Contract")
    private Date dateOfContract;

    @Column(name = "Price",nullable = false)
    private BigDecimal price;

    @Column(name = "Deposit")
    private BigDecimal deposit;

    @Column(name = "Remain")
    private BigDecimal remain;

    @Column(name = "Status")
    private boolean status;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "property_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_Full_Contract_Property"))
    private Property property;

}