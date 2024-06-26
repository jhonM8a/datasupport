package com.technical.support.datasupport.repositories;

import com.technical.support.datasupport.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
