package com.example.PPC.Dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class FullContractDto {


        private String customerName;

        private String yearOfBirth;

        @JsonProperty("ssn")
        private String ssn;

        private String customer_Address;

        private String phoneNumber;

        private Date dateOfContract;

        private BigDecimal price;

        private BigDecimal deposit;


        private BigDecimal remain;


        private boolean status;



    }

