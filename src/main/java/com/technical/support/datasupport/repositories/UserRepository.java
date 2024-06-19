package com.technical.support.datasupport.repositories;

import java.util.Optional;

import com.technical.support.datasupport.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ESTUDIANTE
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
