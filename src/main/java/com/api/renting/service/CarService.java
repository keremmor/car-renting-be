package com.api.renting.service;

import com.api.renting.mapper.CarMapper;
import com.api.renting.model.dao.CarDAO;
import com.api.renting.model.dto.CarDTO;
import com.api.renting.repository.CarRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<CarDTO> getAllCars() {
        return carRepository.findAll().stream()
                .map(CarMapper::toDTO)
                .collect(Collectors.toList());
    }

    public Optional<CarDTO> getCarById(Integer id) {
        return carRepository.findById(id).map(CarMapper::toDTO);
    }

    public CarDTO saveCar(CarDTO carDTO) {
        CarDAO car = CarMapper.toEntity(carDTO);
        CarDAO savedCar = carRepository.save(car);
        return CarMapper.toDTO(savedCar);
    }

    public CarDTO updateCarPrice(Integer id, Integer newPrice) {
        Optional<CarDAO> car = carRepository.findById(id);
        if (car.isPresent()) {
            CarDAO existingCar = car.get();
            existingCar.setDailyRentPrice(newPrice);
            CarDAO updatedCar = carRepository.save(existingCar);
            return CarMapper.toDTO(updatedCar); // DTO'ya dönüştür
        } else {
            throw new EntityNotFoundException("Car not found with id: " + id);
        }
    }

    public void deleteCar(Integer id) {
        carRepository.deleteById(id);
    }
}