package com.kodilla.library.DAO;

import com.kodilla.library.Model;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ModelDao extends CrudRepository<Model, Long> {
    List<Model> findModelByBookId(long bookId);
}
