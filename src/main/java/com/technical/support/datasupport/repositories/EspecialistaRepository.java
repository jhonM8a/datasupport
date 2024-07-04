package com.technical.support.datasupport.repositories;

import com.technical.support.datasupport.entities.Especialista;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EspecialistaRepository extends CrudRepository<Especialista, Long> {
    @Override
    List<Especialista> findAll();
}
