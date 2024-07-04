package com.technical.support.datasupport.repositories;

import com.technical.support.datasupport.entities.Contrato;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContratoRepository extends CrudRepository<Contrato, Long> {
    @Override
    List<Contrato> findAll();
}
