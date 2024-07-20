package com.api.renting.repository;

import com.api.renting.model.dao.RentalDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<RentalDAO, Integer> {
}
