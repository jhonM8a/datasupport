package com.technical.support.datasupport.controllers;

import com.technical.support.datasupport.entities.Especialista;
import com.technical.support.datasupport.repositories.EspecialistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/especialista")
public class EspecialistaController {

    @Autowired
    private EspecialistaRepository especialistaRepository;
    @PostMapping("/crear")
    public ResponseEntity crearEspecialista(@RequestBody Especialista especialista){
        especialistaRepository.save(especialista);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<Especialista> getEspecialistas(){
        return especialistaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Especialista getEspecialista(@PathVariable Long id){
        Optional<Especialista> optionalEspecialista = especialistaRepository.findById(id);
        return optionalEspecialista.isPresent() ? optionalEspecialista.get() : null;
    }
}
