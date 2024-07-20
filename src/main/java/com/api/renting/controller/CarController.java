package com.api.renting.controller;

import com.api.renting.model.dto.CarDTO;
import com.api.renting.model.dto.RentalDTO;
import com.api.renting.service.CarService;
import com.api.renting.service.RentalService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @Autowired
    private RentalService rentalService;

    @GetMapping("getCarList")
    public List<CarDTO> getAllCars() {
        return carService.getAllCars();
    }

    @PostMapping("/saveRent")
    public ResponseEntity<RentalDTO> sevRent(@RequestBody RentalDTO dto) {
        RentalDTO savedDto = rentalService.saveRental(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedDto);
    }

    @PutMapping("/updatePrice/{id}")
    public ResponseEntity<CarDTO> updatePrice(@PathVariable Integer id, @RequestBody Integer newPrice) {
        if (newPrice == null) {
            return ResponseEntity.badRequest().build();
        }
        try {
            CarDTO updatedCar = carService.updateCarPrice(id, newPrice);
            return ResponseEntity.ok(updatedCar);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Integer id) {
        if (!carService.getCarById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        carService.deleteCar(id);
        return ResponseEntity.noContent().build();
    }
}
