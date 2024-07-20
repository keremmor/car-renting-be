package com.api.renting.repository;

import com.api.renting.model.dao.CarDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarDAO, Integer> {
}
