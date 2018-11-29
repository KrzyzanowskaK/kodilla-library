package com.kodilla.library.DAO;

import com.kodilla.library.Rental;
import org.springframework.data.repository.CrudRepository;

public interface RentalDao extends CrudRepository<Rental, Long> {
}
