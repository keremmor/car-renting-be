package com.api.renting.model.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "RENTALS", schema = "TEST_SCHEMA")
public class RentalDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq_gen")
    @SequenceGenerator(name = "employee_seq_gen", sequenceName = "RENTALS_SEQ", allocationSize = 1)
    private Integer id;

    @Column(name = "CUSTOMERNAME")
    private String customerName;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "MODELYEAR")
    private Integer modelYear;

    @Column(name = "DAILYRENTPRICE")
    private Integer dailyRentPrice;
}
