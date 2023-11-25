package com.example.PPC.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


@Data
@Entity
@Table(name = "installment_contract")
public class InstallmentContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false,unique = true)
    private Long id;

    @Column(name = "Install_Contract_Code")
    private String code;

    @Column(name = "Customer_Name",nullable = false)
    private String customerName;

    @Column(name = "Year_Of_Birth",nullable = false)
    private String yearOfBirth;

    @Column(name = "SSN")
    private String SSN;

    @Column(name = "Customer_Address ")
    private String customer_Address;

    @Column(name = "Mobile")
    private String phoneNumber;

    @Column(name = "Date_Of_Contract")
    private Date dateOfContract;

    @Column(name = "Installment_Payment_Method ")
    private String installmentPaymentMethod;

    @Column(name = "Payment_Period")
    private int Payment_Period;

    @Column(name = "Price",nullable = false)
    private BigDecimal price;

    @Column(name = "Deposit")
    private BigDecimal deposit;

    @Column(name = "Loan_Amount")
    private BigDecimal loanAmount;

    @Column(name = "taken",columnDefinition = "bit default 0")
    private Boolean taken;

    @Column(name = "Remain")
    private BigDecimal remain;

    @Column(name = "Status")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "Property_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_Installment_Contract_Property"))
    private Property property;

}