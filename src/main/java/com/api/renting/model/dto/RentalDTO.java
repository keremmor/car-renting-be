package com.api.renting.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RentalDTO {
    private Integer id;
    private String customerName;
    private String brand;
    private String model;
    private Integer modelYear;
    private Integer dailyRentPrice;
}
