package com.kodilla.library.DAO;

import com.kodilla.library.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {
}
