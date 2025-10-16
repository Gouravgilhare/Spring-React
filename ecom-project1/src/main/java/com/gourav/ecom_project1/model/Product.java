package com.gourav.ecom_project1.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String brand;
    private String desc;
    private String catagory;
    private BigDecimal price;

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd-mm--yyyy")
    private Date releaseDate;
    private boolean available;
    private int quantity;
}

