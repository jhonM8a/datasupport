package com.technical.support.datasupport.repositories;

import com.technical.support.datasupport.entities.RegistroHora;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RegistroHoraRepository extends CrudRepository<RegistroHora, Long> {
    @Override
    List<RegistroHora> findAll();
}
