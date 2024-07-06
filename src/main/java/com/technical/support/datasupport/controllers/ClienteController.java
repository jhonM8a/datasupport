package com.technical.support.datasupport.controllers;

import com.technical.support.datasupport.entities.Cliente;
import com.technical.support.datasupport.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @PostMapping("/crear")
    public ResponseEntity crearCliente(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
        return new ResponseEntity(HttpStatus.OK);

    }

    @GetMapping("/all")
    public List<Cliente> getClientes(){
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getCliente(@PathVariable Long id){
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        return clienteOptional.isPresent() ?  clienteOptional.get() : null;
    }
}
