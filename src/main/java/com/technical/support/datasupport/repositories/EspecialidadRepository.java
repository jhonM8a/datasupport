package com.technical.support.datasupport.repositories;

import com.technical.support.datasupport.entities.Especialidad;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EspecialidadRepository extends CrudRepository<Especialidad, Long> {

    @Override
    List<Especialidad> findAll();
}
