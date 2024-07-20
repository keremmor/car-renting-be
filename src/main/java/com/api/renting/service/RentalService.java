package com.api.renting.service;

import com.api.renting.mapper.RentalMapper;
import com.api.renting.model.dao.RentalDAO;
import com.api.renting.model.dto.RentalDTO;
import com.api.renting.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalService {
    @Autowired
    private RentalRepository rentalRepository;

    public RentalDTO saveRental(RentalDTO dto) {
        RentalDAO dao = RentalMapper.toEntity(dto);
        RentalDAO savedDao = rentalRepository.save(dao);
        return RentalMapper.toDTO(savedDao);
    }

}
