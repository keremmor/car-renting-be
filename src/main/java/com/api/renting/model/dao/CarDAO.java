package com.api.renting.model.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "RENTING_CARS", schema = "TEST_SCHEMA")
public class CarDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "MODELYEAR")
    private Integer modelYear;

    @Column(name = "DAILYRENTPRICE")
    private Integer dailyRentPrice;
}

