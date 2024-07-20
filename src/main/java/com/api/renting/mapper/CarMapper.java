package com.api.renting.mapper;

import com.api.renting.model.dao.CarDAO;
import com.api.renting.model.dto.CarDTO;


public class CarMapper {
    public static CarDTO toDTO(CarDAO car) {
        if (car == null) {
            return null;
        }
        CarDTO carDTO = new CarDTO();
        carDTO.setId(car.getId());
        carDTO.setBrand(car.getBrand());
        carDTO.setModel(car.getModel());
        carDTO.setModelYear(car.getModelYear());
        carDTO.setDailyRentPrice(car.getDailyRentPrice());
        return carDTO;
    }

    public static CarDAO toEntity(CarDTO carDTO) {
        if (carDTO == null) {
            return null;
        }
        CarDAO car = new CarDAO();
        car.setId(carDTO.getId());
        car.setBrand(carDTO.getBrand());
        car.setModel(carDTO.getModel());
        car.setModelYear(carDTO.getModelYear());
        car.setDailyRentPrice(carDTO.getDailyRentPrice());
        return car;
    }
}

