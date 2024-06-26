package com.technical.support.datasupport.controllers;

import com.technical.support.datasupport.entities.Cliente;
import com.technical.support.datasupport.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @PostMapping("/crear")
    public ResponseEntity crearCliente(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
        return new ResponseEntity(HttpStatus.OK);

    }
}
