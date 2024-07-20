package com.api.renting.mapper;

import com.api.renting.model.dao.CarDAO;
import com.api.renting.model.dao.RentalDAO;
import com.api.renting.model.dto.RentalDTO;
import com.api.renting.model.dto.RentalDTO;


public class RentalMapper {
    public static RentalDTO toDTO(RentalDAO rentalDAO) {
        if (rentalDAO == null) {
            return null;
        }
        RentalDTO rentalDTO = new RentalDTO();
        rentalDTO.setId(rentalDAO.getId());
        rentalDTO.setCustomerName(rentalDAO.getCustomerName());
        rentalDTO.setBrand(rentalDAO.getBrand());
        rentalDTO.setModel(rentalDAO.getModel());
        rentalDTO.setModelYear(rentalDAO.getModelYear());
        rentalDTO.setDailyRentPrice(rentalDAO.getDailyRentPrice());
        return rentalDTO;
    }

    public static RentalDAO toEntity(RentalDTO rentalDTO) {
        if (rentalDTO == null) {
            return null;
        }
        RentalDAO rentalDAO = new RentalDAO();
        rentalDAO.setId(rentalDTO.getId());
        rentalDAO.setCustomerName(rentalDTO.getCustomerName());
        rentalDAO.setBrand(rentalDTO.getBrand());
        rentalDAO.setModel(rentalDTO.getModel());
        rentalDAO.setModelYear(rentalDTO.getModelYear());
        rentalDAO.setDailyRentPrice(rentalDTO.getDailyRentPrice());
        return rentalDAO;
    }
}

